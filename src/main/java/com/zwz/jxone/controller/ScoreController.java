package com.zwz.jxone.controller;

import com.zwz.jxone.service.ModelRuleService;
import com.zwz.jxone.service.ModelService;
import com.zwz.jxone.service.ModelStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/models/rules")
public class ScoreController {

  @Autowired
  private ModelService modelService;

  @Autowired
  private ModelStrategyService modelStrategyService;

  @Autowired
  private ModelRuleService modelRuleService;


  @GetMapping(path = "/score")
  public Integer getScore(@RequestParam Integer modelId,@RequestParam(required = false) Integer uid){
    //1：通过uid查询用户的基本信息，比如说年龄，收入等
    //2：通过modelId找到策略集合
    //3: 通过策略集合找到规则
    //4:判断当前的用户是否满足规则，返回规则分
    return 0;

  }
}
