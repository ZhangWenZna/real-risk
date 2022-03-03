package com.zwz.jxone.mapper;
import com.zwz.jxone.po.ModelStrategyPo;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelStrategyMapper {
    /**
     *添加
     */
    ModelStrategyPo insert(ModelStrategyPo modelPo);
    /**
     * 删除
     */
    ModelStrategyPo deleteById(Integer id);
    /**
     * 修改
     */
    ModelStrategyPo updateById(ModelStrategyPo modelStrategyPo);
    /**
     * 查找
     */
    ModelStrategyPo servicByid(Integer id);
}
