package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelPO;
import com.zwz.jxone.po.ModelRulePO;

public interface ModelRuleService {
    /**
     *添加
     */
    ModelRulePO insert(ModelRulePO modelRulePo);
    /**
     * 删除
     */
    ModelRulePO deleteById(Integer id);
    /**
     * 修改
     */
    ModelRulePO updateById(ModelRulePO modelRulePo);
    /**
     * 查找
     */
    ModelRulePO selectById(Integer id);

}
