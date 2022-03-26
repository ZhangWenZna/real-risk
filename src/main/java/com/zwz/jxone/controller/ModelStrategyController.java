package com.zwz.jxone.controller;



import com.zwz.jxone.po.ModelStrategyPO;
import com.zwz.jxone.service.ModelStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping(path = "/modelStrategies")
public class ModelStrategyController {
    @Autowired
    private ModelStrategyService modelStrategyService;
    @RequestMapping(method = RequestMethod.GET)
    public ModelStrategyPO selectById(@PathVariable Integer id){
        ModelStrategyPO modelStrategyPO=modelStrategyService.selectById(id);
        return modelStrategyPO;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Integer insertModelStrategy(@RequestBody ModelStrategyService modelStrategyService){
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Integer updateModelStrategyById(@RequestBody ModelStrategyService modelStrategyService){
        return null;
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public Integer deleteModelStrategyById(@RequestBody ModelStrategyService modelStrategyService){
        return null;
    }
}
