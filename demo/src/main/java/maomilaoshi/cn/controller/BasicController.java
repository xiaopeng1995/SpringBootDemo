package maomilaoshi.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Controller 基础类
 */
@RequestMapping("/api")
@Controller
class BasicController {
    /**
     * 系统层-异常处理
     *
     * @return ResponseMessage
     */
    @ExceptionHandler
    public String exception(Exception ex) {
        ex.printStackTrace();
            return "eror";
    }
}
