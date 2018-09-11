package com.nbug.demogooglejib;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NBUG
 * @date 2018/9/11 9:56
 */
@RestController
public class Test {
    @RequestMapping("/")
    public String hello(){

        return "hello,jib";
    }
}
