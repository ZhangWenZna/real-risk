package com.zwz.jxone.service.impl;

import com.zwz.jxone.mapper.ModelRuleMapper;
import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.service.ModelRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelRuleServiceImpl implements ModelRuleService {
    @Autowired
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
}
