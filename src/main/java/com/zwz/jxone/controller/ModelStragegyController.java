package com.zwz.jxone.controller;


import com.zwz.jxone.po.ModelStrategyPO;
import com.zwz.jxone.service.ModelStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ModelStragegyController {
    @Autowired
    private ModelStrategyService modelStrategyService;


    @RequestMapping("/lest/{id}")
    public String delect(@PathVariable(value = "id") Integer id){
        try {
            modelStrategyService.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/list";
    }
}
