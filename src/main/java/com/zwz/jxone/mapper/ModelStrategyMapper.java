package com.zwz.jxone.mapper;
import com.zwz.jxone.po.ModelStrategyPO;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelStrategyMapper {
    /**
     *添加
     */
    ModelStrategyPO insert(ModelStrategyPO modelPo);
    /**
     * 删除
     */
    ModelStrategyPO deleteById(Integer id);
    /**
     * 修改
     */
    ModelStrategyPO updateById(ModelStrategyPO modelStrategyPo);
    /**
     * 查找
     */
    ModelStrategyPO servicByid(Integer id);
}
