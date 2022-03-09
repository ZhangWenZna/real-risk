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
  public ModelPO selectById(@PathVariable Integer id){
    ModelPO modelPO = modelService.selectById(id);
    return modelPO;
  }

  @RequestMapping(method = RequestMethod.POST)
  public Integer insertModel(@RequestBody ModelPO modelPO){
   return null;
  }

  @RequestMapping(method = RequestMethod.PUT)
  public Integer updateModelById(@RequestBody ModelPO modelPO){
    return null;
  }


  @RequestMapping(method = RequestMethod.DELETE)
  public Integer deleteModelById(@RequestBody ModelPO modelPO){
    return null;
  }
}
