package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelStrategyPO;

import java.util.List;

public interface ModelStrategyService {
    /**
     *添加
     */
    ModelStrategyPO insert(ModelStrategyPO modelStrategyPO);
    /**
     * 删除
     */
    ModelStrategyPO deleteById(Integer id);
    /**
     * 修改
     */
    ModelStrategyPO updateById(ModelStrategyPO modelStrategyPO);
    /**
     * 查找
     */
    ModelStrategyPO selectById(Integer id);

    List<ModelStrategyPO> listStrategyByModelId(Integer modelId);
}
