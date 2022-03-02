package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelPo;
import com.zwz.jxone.po.ModelRulePo;

public interface ModelRuleService {
    /**
     *添加
     */
    ModelRulePo insert(ModelRulePo modelRulePo);
    /**
     * 删除
     */
    ModelRulePo deleteById(Integer id);
    /**
     * 修改
     */
    ModelRulePo updateById(ModelRulePo modelRulePo);
    /**
     * 查找
     */
    ModelRulePo servicByid(Integer id);

}
