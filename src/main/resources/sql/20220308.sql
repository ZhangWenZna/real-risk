create table `model_strategy`
(
    `ID`            bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `strategy_NAME` varchar(64)    NOT NULL COMMENT '名称',
    `LABEL`         varchar(32)  NOT NULL DEFAULT '' comment '标签',
    `MODEL_ID`      bigint(11) NOT NULL COMMENT 'model id',
    `COMMENT`       varchar(128) NOT NULL COMMENT '注释',
    `score`         decimal(11, 2)                       NOT NULL COMMENT '得分',
    `status`        int(11) NOT NULL COMMENT '策略的状态',
    `create_time`   datetime                             NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   datetime                             NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    PRIMARY KEY (`ID`)
) ENGINE=InnoDB comment '策略表';


create table `model`
(
    `ID`          bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `MODEL_NAME`  varchar(30)  NOT NULL COMMENT '模型名称',
    `LABEL`       varchar(32)  NOT NULL DEFAULT '' comment '标签',
    `STATUS`      int(11) NOT NULL COMMENT '状态',
    `create_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    PRIMARY KEY (`ID`)
) ENGINE=InnoDB comment '模型表';



CREATE TABLE `model_rule`
(
    `ID`              bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `MODEL_ID`        bigint(20) NOT NULL COMMENT '模型ID',
    `strategy_id`     bigint(20) NOT NULL COMMENT '激活ID',
    `NAME`            varchar(64)   NOT NULL DEFAULT '' comment '名称',
    `field_Name`       varchar(64)    NOT NULL DEFAULT '' COMMENT '规则名称',
    `SCRIPTS`         varchar(2048)  NOT NULL COMMENT '检验脚本',
    `INIT_SCORE`      int(11) NOT NULL DEFAULT '0' COMMENT '初始分数',
    `BASE_NUM`        int(11) NOT NULL DEFAULT '0' COMMENT '基数',
    `OPERATOR`        varchar(32)    NOT NULL COMMENT '运算符',
    `RATE`            int(11) NOT NULL DEFAULT '100' COMMENT '比例',
    `STATUS`          int(11) NOT NULL COMMENT '状态',
    `RULE_DEFINITION` varchar(2048)          DEFAULT NULL comment '规则引擎的定义',
    `create_time`     datetime                              NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`     datetime                              NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间', PRIMARY KEY (`ID`)
) ENGINE=InnoDB comment '预处理字段表';




