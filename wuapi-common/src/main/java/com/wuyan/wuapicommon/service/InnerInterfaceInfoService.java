package com.wuyan.wuapicommon.service;


import com.wuyan.wuapicommon.model.entity.InterfaceInfo;

/**
* @author wuyan
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-23 18:11:13
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询接口是否存在（请求路径，请求方法，请求参数）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
