package com.zwz.jxone.service.impl;

import com.zwz.jxone.dao.mapper.ModelRuleMapper;
import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.service.ModelRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelRuleServiceImpl implements ModelRuleService {
    @Autowired(required = false)
    ModelRuleMapper modelRuleMapper;


    @Override
    public ModelRulePO insert(ModelRulePO modelRulePo) {

        return modelRuleMapper.insert(modelRulePo);
    }

    @Override
    public ModelRulePO deleteById(Integer id) {
        return modelRuleMapper.deleteById(id);
    }

    @Override
    public ModelRulePO updateById(ModelRulePO modelRulePo) {

        return modelRuleMapper.updateById(modelRulePo);
    }

    @Override
    public ModelRulePO selectById(Integer id) {
        return modelRuleMapper.selectById(id);
    }

    @Override
    public List<ModelRulePO> listRulesByStrategyId(Integer strategyId) {
        return modelRuleMapper.listRulesByStrategyId(strategyId);
    }
}
