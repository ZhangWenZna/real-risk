package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.ModelPO;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

/**
 * ming
 */
@Repository
public interface ModelMapper {
    Integer insertMode();

    ModelPO selectByID(Long id);
    ModelPO updateById(ModelPO modelPO);
    Integer deleteById(Long id);

}
