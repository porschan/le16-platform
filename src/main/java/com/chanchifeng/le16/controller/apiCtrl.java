package com.chanchifeng.le16.controller;

import com.alibaba.fastjson.JSONObject;
import com.chanchifeng.le16.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:porschan
 * @description:
 * @date: Created in 15:35 2018/12/8
 * @modified By:
 */

//@RequestMapping("user")
@RestController
public class apiCtrl {

    //    @ResponseBody
    @RequestMapping(value = "/api/postLogin", method = { RequestMethod.POST })
    public User gainTime(@RequestBody JSONObject jsonParam){
        // 直接将json信息打印出来
        System.out.println(jsonParam.toJSONString());

        // 将获取的json数据封装一层，然后在给返回
//        JSONObject result = new JSONObject();
//        result.put("msg", "ok");
//        result.put("method", "@ResponseBody");
//        result.put("data", jsonParam);

        User user = new User();
        user.setId(1);
        user.setPassword("1");
        user.setUsername("porschan");
        return user;
//        return System.currentTimeMillis() + "";
    }

}
