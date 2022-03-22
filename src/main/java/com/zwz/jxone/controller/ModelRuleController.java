package com.zwz.jxone.controller;

import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.service.ModelRuleService;
import com.zwz.jxone.vo.StrategyReqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ModelRulePO insertModelRule(@RequestBody ModelRulePO modelRulePO){
        ModelRulePO modelRulePOs=modelRuleService.insert(modelRulePO);
        return modelRulePOs;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ModelRulePO updateModelRuleById(@RequestBody ModelRulePO modelRulePO){
        ModelRulePO modelRulePOs=modelRuleService.updateById(modelRulePO);
        return modelRulePOs;
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public ModelRulePO deleteModelRuleById(@RequestBody Integer id){
        ModelRulePO modelRulePOs=modelRuleService.deleteById(id);

        return modelRulePOs;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/strategies/")
    public List<ModelRulePO> listRulesByStrategyId(@RequestBody StrategyReqVO strategyReqVO){
        List<ModelRulePO> modelRulePOs=modelRuleService.listRulesByStrategyId(strategyReqVO.getStrategyId());

        return modelRulePOs;
    }

}
