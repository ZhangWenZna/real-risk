package com.zwz.jxone.po;
import java.sql.Timestamp;

/**
 * 预处理字段表
 */
public class ModelRulePO {
    /**
     * 用户ID，主键
     */
    private Long id;
    /**
     * 模型ID
     */
    private Long modelId;
    /**
     * 激活ID
     */
    private Long strategyId;
    /**
     * 名称
     */
    private String name;
    /**
     * 规则名称
     */
    private String fieldName;
    /**
     * 检验脚本
     */
    private String scripts;
    /**
     * 初始分数
     */
    private Long initScore;
    /**
     * 基数
     */
    private Long baseNum;
    /**
     * 运算符
     */
    private String operator;
    /**
     * 比例
     */
    private Long rate;
    /**
     * 状态
     */
    private Long stayus;
    /**
     * 规则引擎
     */
    private String ruleDefinition;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 更新时间
     */
    private Timestamp updataTime;

    public ModelRulePO(){}

    public ModelRulePO(Long id, Long modelId, Long strategyId, String name, String fieldName, String scripts, Long initScore, Long baseNum, String operator, Long rate, Long stayus, String ruleDefinition, Timestamp createTime, Timestamp updataTime) {

        this.id = id;
        this.modelId = modelId;
        this.strategyId = strategyId;
        this.name = name;
        this.fieldName = fieldName;
        this.scripts = scripts;
        this.initScore = initScore;
        this.baseNum = baseNum;
        this.operator = operator;
        this.rate = rate;
        this.stayus = stayus;
        this.ruleDefinition = ruleDefinition;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getScripts() {
        return scripts;
    }

    public void setScripts(String scripts) {
        this.scripts = scripts;
    }

    public Long getInitScore() {
        return initScore;
    }

    public void setInitScore(Long initScore) {
        this.initScore = initScore;
    }

    public Long getBaseNum() {
        return baseNum;
    }

    public void setBaseNum(Long baseNum) {
        this.baseNum = baseNum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getStayus() {
        return stayus;
    }

    public void setStayus(Long stayus) {
        this.stayus = stayus;
    }

    public String getRuleDefinition() {
        return ruleDefinition;
    }

    public void setRuleDefinition(String ruleDefinition) {
        this.ruleDefinition = ruleDefinition;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Timestamp updataTime) {
        this.updataTime = updataTime;
    }
}
