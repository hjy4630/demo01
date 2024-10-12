package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author: huangjingyu
 * @date: 2024-10-11
 */
@RestController
@RequestMapping
public class DemoController {
    @GetMapping("/demo")
    public String demo(){
        return "hello world";
    }
    @GetMapping("/demo2")
    public String demo2(){
        return "demo2";
    }
    @GetMapping("/demo3")
    public String demo3(){
        return "修改demo";
    }
    @GetMapping("/demo4")
    public String demo4(){
        return "demo4";
    }

}
