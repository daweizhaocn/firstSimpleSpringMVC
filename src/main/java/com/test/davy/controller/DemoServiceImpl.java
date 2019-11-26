package com.test.davy.controller;

import org.springframework.stereotype.Service;

/**
 * 〈〉
 *
 * @author daweizhao
 * @create 19/11/25 22:10
 */

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public BaseResult<String> hello(String name){
        BaseResult<String> result = new BaseResult<>();

        result.success("hello " + name);

        return result;
    }

}

