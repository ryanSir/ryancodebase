package com.ryan.codebase.common.utils.controller;

import com.ryan.codebase.common.utils.aop.NoRepeatSubmit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ryan
 * @version Id: RepeatSubmitController, v 0.1 2021/8/4 下午6:17 ryan Exp $
 */
@RestController
public class RepeatSubmitController {

    @GetMapping("/repeatSubmit")
    @NoRepeatSubmit(lockTime = 5000)
    public void repeatSubmit(@RequestParam Integer param) {
        System.out.println("repeat submit test");
    }
}