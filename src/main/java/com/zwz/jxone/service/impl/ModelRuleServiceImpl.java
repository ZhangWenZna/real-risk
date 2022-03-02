package com.zwz.jxone.service.impl;

import com.zwz.jxone.mapper.ModelRuleMapper;
import com.zwz.jxone.po.ModelRulePo;
import com.zwz.jxone.service.ModelRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelRuleServiceImpl implements ModelRuleService {
    @Autowired
    ModelRuleMapper modelRuleMapper;


    @Override
    public ModelRulePo insert(ModelRulePo modelRulePo) {
        return modelRuleMapper.insert(modelRulePo);
    }

    @Override
    public ModelRulePo deleteById(Integer id) {
        return modelRuleMapper.deleteById(id);
    }

    @Override
    public ModelRulePo updateById(ModelRulePo modelRulePo) {
        return modelRuleMapper.updateById(modelRulePo);
    }

    @Override
    public ModelRulePo servicByid(Integer id) {
        return modelRuleMapper.servicByid(id);
    }
}
