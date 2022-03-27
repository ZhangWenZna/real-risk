package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelPO;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

/**
 * ming
 */
@Repository
public interface ModelMapper {
    ModelPO selectById(Integer id);
    ModelPO updateById(ModelPO modelPO);
    ModelPO deleteById(Integer id);
    ModelPO insert(ModelPO modelPO);

}
