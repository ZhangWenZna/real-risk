package com.zwz.jxone.mapper;

import com.zwz.jxone.po.ModelPO;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelMapper {
    /**
     *添加
     */
    ModelPO insert(ModelPO modelPo);
    /**
     * 删除
     */
    ModelPO deleteById(Integer id);
    /**
     * 修改
     */
    ModelPO updateById(ModelPO modelPO);
    /**
     * 查找
     */
    ModelPO selectById(Integer id);


}
