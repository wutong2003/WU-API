package com.wuyan.wuapibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuyan.wuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author wyh
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-06-04 18:02:26
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

        List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




