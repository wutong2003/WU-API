package com.wuyan.wuapibackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyan.wuapicommon.model.entity.InterfaceInfo;

/**
* @author wuyan
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-23 18:11:13
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
