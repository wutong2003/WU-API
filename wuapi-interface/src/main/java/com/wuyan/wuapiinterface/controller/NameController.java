package com.wuyan.wuapiinterface.controller;

import com.wuyan.wuapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
////        String secretKey = request.getHeader("secretKey");  不能直接获取密钥
//        if(!accessKey.equals("wuyan") ){
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) >10000){
//            throw new RuntimeException("无权限");
//        }
//////         todo 时间和当前时间不能超过 5 分钟
//////        if (timestamp) {}
////         todo 实际情况中是从数据库中查出 secretKey
//        String serverSign = SignUtils.genSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
////         todo 调用次数 + 1 invokeCount

        String result = "POST 用户名字是" + user.getUsername();
        //调用成功后
        return result;
    }
}