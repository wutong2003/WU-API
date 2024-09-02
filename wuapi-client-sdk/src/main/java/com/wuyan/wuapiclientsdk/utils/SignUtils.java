package com.wuyan.wuapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 生成签名
 */
public class SignUtils {
    /**
     * 生成签名
     *
     * @param body
     * @param secretKey
     * @return
     */
    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256); //指定加密算法SHA256，来自Hutool
        String content = body + "." + secretKey; //构架签名内容，将哈希转换为字符串和密钥拼接
        return md5.digestHex(content);//计算签名的摘要并返回摘要的十六进制表现形式
    }
}
