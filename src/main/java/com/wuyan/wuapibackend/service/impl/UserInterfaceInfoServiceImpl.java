package com.wuyan.wuapibackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyan.wuapibackend.common.ErrorCode;
import com.wuyan.wuapibackend.exception.BusinessException;
import com.wuyan.wuapibackend.mapper.UserInterfaceInfoMapper;
import com.wuyan.wuapibackend.service.UserInterfaceInfoService;
import com.wuyan.wuapicommon.model.entity.UserInterfaceInfo;
import org.springframework.stereotype.Service;

/**
* @author wyh
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-06-04 18:02:26
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        //如果是添加操作
        if (add) {
            if (userInterfaceInfo.getInterfaceInfoId() <=0 || userInterfaceInfo.getUserId() <= 0){
                throw new BusinessException(ErrorCode.PARAMS_ERROR,"接口或用户不存在");
            }
        }
        if (userInterfaceInfo.getLeftNum() < 0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"剩余调用次数不能小于0");
        }
    }

    @Override
    public boolean invokeCount(Long interfaceInfoId, Long userId) {
        if(interfaceInfoId <= 0  || userId <= 0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"接口或用户不存在");
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interfaceInfoId",interfaceInfoId);
        updateWrapper.eq("userId",userId);
        updateWrapper.gt("leftNum",0);
        updateWrapper.setSql("leftNum = leftNum - 1 ,totalNum = totalNum +1");
        return  this.update(updateWrapper);
    }
}




