package com.zwz.jxone.mapper;


import com.zwz.jxone.po.ModelRulePo;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRuleMapper {
    /**
     *添加
     */
    ModelRulePo insert(ModelRulePo modelPo);
    /**
     * 删除
     */
    ModelRulePo deleteById(Integer id);
    /**
     * 修改
     */
    ModelRulePo updateById(Integer id);
    /**
     * 查找
     */
    ModelRulePo servicByid(Integer id);
}
