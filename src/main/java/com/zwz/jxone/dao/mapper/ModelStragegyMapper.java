package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.po.ModelStrategyPO;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

/**
 * ming
 */
@Repository
public interface ModelStragegyMapper {
    Integer insertModelStragegy();
    ModelStrategyPO selectById(Long id);
    ModelStrategyPO updateById(ModelStrategyPO modelRulePO);
    ModelStrategyPO deleteById(Long id);
}
