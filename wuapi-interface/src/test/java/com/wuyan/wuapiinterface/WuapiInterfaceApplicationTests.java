package com.wuyan.wuapiinterface;

import com.wuyan.wuapiclientsdk.client.WuApiClient;
import com.wuyan.wuapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class WuapiInterfaceApplicationTests {

    // 注入一个名为wuApiClient的Bean
    @Resource
    private WuApiClient wuApiClient;
    // 表示这是一个测试方法
    @Test
    void contextLoads() {
        // 调用wuApiClient的getNameByGet方法，并传入参数"wuyan"，将返回的结果赋值给result变量
        String result = wuApiClient.getNameByGet("wuyan");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"wuyan"
        user.setUsername("wuyan");
        // 调用wuApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = wuApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }


}
