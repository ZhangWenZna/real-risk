package com.zwz.jxone.po;

import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * 模型表
 */
public class ModelPO {
    /**
     * id主键
     */
    private Integer id;
    /**
     * 模型名称
     */
    private String modelName;
    /**
     * 标签
     */
    private String label;
    /**
     * 状态
     */
    private String status;
    /**
     * 创建时间
     */
    private LocalDate createTime;
    /**
     * 更新时间
     */
    private LocalDate updataTime;

    public ModelPO() {
    }

    public ModelPO(Integer id, String modelName, String label, String status, LocalDate createTime, LocalDate updataTime) {
        this.id = id;
        this.modelName = modelName;
        this.label = label;
        this.status = status;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(LocalDate updataTime) {
        this.updataTime = updataTime;
    }
}

