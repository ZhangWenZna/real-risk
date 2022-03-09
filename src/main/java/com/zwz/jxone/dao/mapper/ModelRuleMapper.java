package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelRulePO;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

/**
 * ming
 */
@Repository
public interface ModelRuleMapper {

  Integer insert(ModelRulePO modelRulePO);

  ModelRulePO selectById(Long id);

  ModelRulePO updateById(ModelRulePO modelRulePO);
  Integer deleteById(Long id);



}
