package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelPO;
import com.zwz.jxone.po.ModelRulePO;

import java.util.List;

public interface ModelRuleService {
    /**
     *添加
     */
    ModelRulePO insert(ModelRulePO modelRulePo);
    /**
     * 删除
     */
    ModelRulePO deleteById(Long id);
    /**
     * 修改
     */
    ModelRulePO updateById(ModelRulePO modelRulePo);
    /**
     * 查找
     */
    ModelRulePO selectById(Long id);

  List<ModelRulePO> listRulesByStrategyId(Integer strategyId);
}
