package com.xiaohei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 非洲小黑 on 2018/2/26.
 */
@Controller
@RequestMapping(value = "freeMaker")
public class FreeMakerController {

    @RequestMapping()
    public String freeMaker(Model model){
        model.addAttribute("msg","freeMaker的视图");
        return "freeMaker";
    }

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("msg","freeMaker的hello的视图");
        return "freeMaker/hello";
    }
}