package com.wuyan.wuapibackend.service.impl.inner;

import com.wuyan.wuapibackend.service.UserInterfaceInfoService;
import com.wuyan.wuapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(Long interfaceInfoId, Long userId) {

        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
