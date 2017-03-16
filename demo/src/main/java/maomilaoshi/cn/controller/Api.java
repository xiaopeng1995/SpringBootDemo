package maomilaoshi.cn.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaopeng on 2017/3/16.
 */
@CrossOrigin
@RestController
public class Api extends BasicController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam String msg) {
        System.out.println(1);
        return "msg:"+msg;
    }
}
