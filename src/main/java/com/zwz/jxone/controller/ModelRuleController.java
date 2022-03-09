package com.zwz.jxone.controller;

import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.service.ModelRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="ModelRules")
public class ModelRuleController {
    @Autowired
    private ModelRuleService modelRuleService;
    @RequestMapping(method = RequestMethod.GET)
    public ModelRulePO selectById(@PathVariable Integer id){
        ModelRulePO modelRulePO=modelRuleService.selectById(id);
        return modelRulePO;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Integer insertModelRule(@RequestBody ModelRulePO modelRulePO){
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Integer updateModelRuleById(@RequestBody ModelRulePO modelRulePO){
        return null;
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public Integer deleteModelRuleById(@RequestBody ModelRulePO modelRulePO){
        return null;
    }

}
