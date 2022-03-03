package com.zwz.jxone.mapper;

import com.zwz.jxone.po.ModelPo;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelMapper {
    /**
     *添加
     */
    ModelPo insert(ModelPo modelPo);
    /**
     * 删除
     */
    ModelPo deleteById(Integer id);
    /**
     * 修改
     */
    ModelPo updateById(Integer id);
    /**
     * 查找
     */
    ModelPo servicByid(Integer id);


}
