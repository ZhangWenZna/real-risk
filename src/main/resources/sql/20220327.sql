insert into model(`MODEL_NAME`,`LABEL`,`status`)
values ('注册风控','模型场景1',0);

insert into model_strategy(`STRATEGY_NAME`,`LABEL`,`model_id`,`COMMENT`,`score`,`status`)
values('策略1','高风险',1,'测试集合',100,0);

insert into model_rule(`MODEL_ID`,`strategy_id`,`NAME`,`field_Name`,`SCRIPTS`,`INIT_SCORE`,`BASE_NUM`,`OPERATOR`,`RATE`,`status`,`RULE_DEFINITION`)
values(1,1,'规则1','age','class ActivationCheckScript { \n    public boolean check(def data, def lists) { \nif (data.abstractions.age>=15) \n return true;\n else \n return false; \n}}',1,0,'',0,0,'测试集合');

insert into model_rule(`MODEL_ID`,`strategy_id`,`NAME`,`field_Name`,`SCRIPTS`,`INIT_SCORE`,`BASE_NUM`,`OPERATOR`,`RATE`,`status`,`RULE_DEFINITION`)
values(1,1,'规则2','income','class ActivationCheckScript { \n    public boolean check(def data, def lists) { \nif (data.abstractions.income>0) \n return true;\n else \n return false; \n}}',1,0,'',0,0,'测试集合');

