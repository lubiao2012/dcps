package com.baidu.dcps.controller;

import com.baidu.dcps.dao.entity.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/helloworld/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@PathVariable long id) {
        System.out.println("hello world");
        System.out.println(id);

        Gson gson = new Gson();
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", "hello world");
        result.put("id", String.valueOf(id));
        return gson.toJson(result);
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    @ResponseBody
    public String getParam(@RequestBody User user) {

        System.out.println(user.getName());
        System.out.println(user.getAge());

        Gson gson = new Gson();
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", "hello world");
        return gson.toJson(result);

    }

}
