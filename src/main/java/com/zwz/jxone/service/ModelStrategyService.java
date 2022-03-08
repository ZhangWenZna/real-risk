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
    ModelStrategyPO deleteById(Integer id);
    /**
     * 修改
     */
    ModelStrategyPO updateById(ModelStrategyPO modelStrategyPO);
    /**
     * 查找
     */
    ModelStrategyPO servicByid(Integer id);
}
