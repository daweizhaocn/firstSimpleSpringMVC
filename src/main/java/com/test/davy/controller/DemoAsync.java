package com.test.davy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 〈〉
 *
 * @author daweizhao
 * @create 19/11/25 22:10
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoAsync {

    @Resource
    private DemoService demoService;

    @RequestMapping("/async")
    //@ResponseBody
    public BaseResult<String> hello(){
        return demoService.hello("demo");
    }

    @RequestMapping("/asynctest")
    public String asyncTest(HttpServletRequest request){
        log.debug("davytest debug ------");
        String input = request.getParameter("input");
        return "hello,"+input;
    }


}
