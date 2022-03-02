package com.zwz.jxone.po;

import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * 策略表
 */
public class ModelStrategyPO {
  /**
   * id主键
   */
  private Integer id;
  /**
   * 名称
   */
  private String strategyName;
  /**
   * 标签
   */
  private String label;
  /**
   * model id
   */
  private Integer modelId;
  /**
   * 注释
   */
  private String comment;
  /**
   * 得分
   */
  private Double score;
  /**
   * 策略状态
   */
  private Integer status;
  /**
   * 创建时间
   */
  private LocalDate createTime;
  /**
   * 更新时间
   */
  private LocalDate updataTime;

  public ModelStrategyPO() {
  }

  public ModelStrategyPO(Integer id, String strategyName, String label, Integer modelId, String comment, Double score, Integer status,
                         LocalDate createTime, LocalDate updataTime) {
    this.id = id;
    this.strategyName = strategyName;
    this.label = label;
    this.modelId = modelId;
    this.comment = comment;
    this.score = score;
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

  public String getStrategyName() {
    return strategyName;
  }

  public void setStrategyName(String strategyName) {
    this.strategyName = strategyName;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Integer getModelId() {
    return modelId;
  }

  public void setModelId(Integer modelId) {
    this.modelId = modelId;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
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
