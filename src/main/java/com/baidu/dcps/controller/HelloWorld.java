package com.baidu.dcps.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * User: wanngrun03@baidu.com
 * Date: 2017-07-21
 * Time: 上午11:36
 */


@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    @ResponseBody
    public String hello() {
        System.out.println("hello world");
        Gson gson = new Gson();
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", "hello world");
        return gson.toJson(result);
    }

}
