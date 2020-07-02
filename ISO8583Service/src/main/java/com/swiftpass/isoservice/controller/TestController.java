package com.swiftpass.isoservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController <br/>
 * Description: <br/>
 * date: 2020/6/30 14:58<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping("/hello")
    public String testReq(){
        log.info("Hello world");
        return "Hello world";
    }
}
