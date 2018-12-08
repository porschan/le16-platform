package com.chanchifeng.le16.conf;

import com.chanchifeng.le16.bean.ResultBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:29 2018/12/8
 * @modified By:
 */

public class ErrorView {
    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public Object defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        if (!returnJson(request)) {
            ModelAndView view = new ModelAndView();
            view.addObject("ERRORCODE", 500);
            view.addObject("ERRORMSG", e.getMessage());
            view.addObject("URL", request.getRequestURL());
            view.setViewName("error");
            return view;
        } else {
            System.out.println("is json");
            ResultBean bean = new ResultBean();
            bean.setStatusCode(-1);
            bean.setStatusMsg("[api异常]" + e.getMessage());
            return bean;
        }
    }
    @ResponseBody
    @ExceptionHandler(value=NoHandlerFoundException.class)
    public Object pageNoFoundHandler(HttpServletRequest request, Exception e) throws Exception {
        if (!returnJson(request)) {
            ModelAndView view = new ModelAndView();
            view.addObject("ERRORCODE", 404);
            view.addObject("ERRORMSG", "页面未找到");
            view.addObject("URL", request.getRequestURL());
            view.setViewName("error");
            return view;
        } else {
            System.out.println("is json");
            ResultBean bean = new ResultBean();
            bean.setStatusCode(-1);
            bean.setStatusMsg("地址未找到");
            return bean;
        }
    }
    private boolean returnJson(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return request.getRequestURI().contains("/api/");
    }
}
