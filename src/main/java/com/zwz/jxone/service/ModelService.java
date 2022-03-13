package com.zwz.jxone.service;

import com.zwz.jxone.po.ModelPO;

public interface ModelService {
    /**
     *添加
     */
    ModelPO insert(ModelPO modelPO);
    /**
     * 删除
     */
    ModelPO deleteById(Long id);
    /**
     * 修改
     */
    ModelPO updateById(ModelPO modelPo);
    /**
     * 查找
     */
    ModelPO selectById(Long id);

}
