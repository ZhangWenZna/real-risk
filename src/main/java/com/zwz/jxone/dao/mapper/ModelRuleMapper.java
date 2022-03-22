package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelRulePO;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ming
 */
@Repository
public interface ModelRuleMapper {

  ModelRulePO insert(ModelRulePO modelRulePO);

  ModelRulePO selectById(Integer id);

  ModelRulePO updateById(ModelRulePO modelRulePO);
  ModelRulePO deleteById(Integer id);


  List<ModelRulePO> listRulesByStrategyId(Integer strategyId);
}
