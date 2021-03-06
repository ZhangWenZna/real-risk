package com.zwz.jxone.service.impl;

import com.zwz.jxone.dao.mapper.ModelStrategyMapper;
import com.zwz.jxone.po.ModelStrategyPO;
import com.zwz.jxone.service.ModelStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelStrategyServiceImpl implements ModelStrategyService {

    @Autowired(required = false)
    ModelStrategyMapper modelStrategyMapper;
    @Override
    public ModelStrategyPO insert(ModelStrategyPO modelStrategyPO) {
        return modelStrategyMapper.insert(modelStrategyPO);
    }

    @Override
    public ModelStrategyPO deleteById(Integer id) {
        return modelStrategyMapper.deleteById(id);
    }

    @Override
    public ModelStrategyPO updateById(ModelStrategyPO modelStrategyPO) {
        return modelStrategyMapper.updateById(modelStrategyPO);
    }

    @Override
    public ModelStrategyPO selectById(Integer id) {
        return modelStrategyMapper.selectById(id);
    }

    @Override
    public List<ModelStrategyPO> listStrategyByModelId(Integer modelId) {
        return modelStrategyMapper.listStrategyByModelId(modelId);
    }
}
