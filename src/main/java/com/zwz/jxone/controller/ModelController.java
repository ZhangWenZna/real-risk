package com.zwz.jxone.controller;


import com.zwz.jxone.po.ModelPO;
import com.zwz.jxone.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/models")
public class ModelController {

  @Autowired
  private ModelService modelService;

  @RequestMapping(method = RequestMethod.GET)
  public ModelPO selectById(@PathVariable Long id){
    ModelPO modelPO = modelService.selectById(id);
    return modelPO;
  }

  @RequestMapping(method = RequestMethod.POST)
  public ModelPO insertModel(@RequestBody ModelPO modelPO){
    ModelPO modelPO1=modelService.insert(modelPO);

    return modelPO1;
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ModelPO updateModelById(@RequestBody ModelPO modelPO){
    ModelPO modelPO1=modelService.updateById(modelPO);
    return modelPO1;
  }


  @RequestMapping(method = RequestMethod.DELETE)
  public ModelPO deleteModelById(@RequestBody Long id){
    ModelPO modelPO=modelService.deleteById(id);
    return modelPO;
  }
}
