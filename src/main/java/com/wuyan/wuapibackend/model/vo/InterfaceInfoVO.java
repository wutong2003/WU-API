package com.wuyan.wuapibackend.model.vo;

import com.wuyan.wuapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 接口信息封装视图
 * 继承自InterfaceInfo，补充一个调用次数的字段
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}