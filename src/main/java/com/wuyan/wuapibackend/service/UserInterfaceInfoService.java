package com.wuyan.wuapibackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyan.wuapicommon.model.entity.UserInterfaceInfo;

/**
 * @author wuyan
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-05-23 18:11:13
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(Long interfaceInfoId, Long userId);
}
