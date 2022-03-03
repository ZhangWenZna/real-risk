package com.zwz.jxone.po;
import java.sql.Timestamp;

/**
 * 预处理字段表
 */
public class ModelRulePo {
    /**
     * 用户ID，主键
     */
    private Integer id;
    /**
     * 模型ID
     */
    private Integer modelId;
    /**
     * 激活ID
     */
    private Integer strategyId;
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
    private Integer initScore;
    /**
     * 基数
     */
    private Integer baseNum;
    /**
     * 运算符
     */
    private String operator;
    /**
     * 比例
     */
    private Integer rate;
    /**
     * 状态
     */
    private Integer stayus;
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

    public ModelRulePo(){}

    public ModelRulePo(Integer id, Integer modelId, Integer strategyId, String name, String fieldName, String scripts, Integer initScore, Integer baseNum, String operator, Integer rate, Integer stayus, String ruleDefinition, Timestamp createTime, Timestamp updataTime) {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
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

    public Integer getInitScore() {
        return initScore;
    }

    public void setInitScore(Integer initScore) {
        this.initScore = initScore;
    }

    public Integer getBaseNum() {
        return baseNum;
    }

    public void setBaseNum(Integer baseNum) {
        this.baseNum = baseNum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getStayus() {
        return stayus;
    }

    public void setStayus(Integer stayus) {
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
