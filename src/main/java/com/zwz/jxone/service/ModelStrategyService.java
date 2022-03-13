package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelStrategyPO;

public interface ModelStrategyService {
    /**
     *添加
     */
    ModelStrategyPO insert(ModelStrategyPO modelStrategyPO);
    /**
     * 删除
     */
    ModelStrategyPO deleteById(Long id);
    /**
     * 修改
     */
    ModelStrategyPO updateById(ModelStrategyPO modelStrategyPO);
    /**
     * 查找
     */
    ModelStrategyPO selectById(Long id);
}
