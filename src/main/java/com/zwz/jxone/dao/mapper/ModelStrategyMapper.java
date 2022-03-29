package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelStrategyPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ming
 */
@Repository
public interface ModelStrategyMapper {
    ModelStrategyPO insert(ModelStrategyPO modelStrategyPO);
    ModelStrategyPO selectById(Integer id);
    ModelStrategyPO updateById(ModelStrategyPO modelRulePO);
    ModelStrategyPO deleteById(Integer id);
    List<ModelStrategyPO> listStrategyByModelId(Integer modelId);
}
