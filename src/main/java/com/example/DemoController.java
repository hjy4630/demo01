package com.example;

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
    @RequestMapping("/demo")
    public String demo(){
        return "hello world";
    }
}
