package com.wuyan.wuapicommon.service;


import com.wuyan.wuapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author wuyan
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey)
     * @param accessKey
     * @param secretkey
     * @return
     */
    User getInvokeUser(String accessKey);
}
