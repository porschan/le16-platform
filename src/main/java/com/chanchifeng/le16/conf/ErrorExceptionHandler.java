package com.chanchifeng.le16.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:18 2018/12/8
 * @modified By:
 */

@ControllerAdvice
public class ErrorExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ErrorExceptionHandler.class);
    /**
     * 处理运行时异常的方法
     * @param exception 运行时异常
     * @return ModelAndView实例对象
     */
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception) {
        logger.info("自定义异常处理-RuntimeException");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", exception.getMessage());
        modelAndView.setViewName("500");
        return modelAndView;
    }

    /**
     * 处理空指针异常的页面
     * @param exception 空指针异常
     * @return ModelAndView实例对象
     */
    @ExceptionHandler({NullPointerException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(NullPointerException exception) {
        logger.info("自定义异常处理-NullPointerException");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", exception.getMessage());
        modelAndView.setViewName("nullPointer");
        return modelAndView;
    }
}
