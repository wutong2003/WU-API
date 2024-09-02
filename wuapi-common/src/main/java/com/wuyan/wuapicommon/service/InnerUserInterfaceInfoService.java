package com.wuyan.wuapicommon.service;


/**
* @author wyh
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-06-04 18:02:26
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(Long interfaceInfoId, Long userId);
}
