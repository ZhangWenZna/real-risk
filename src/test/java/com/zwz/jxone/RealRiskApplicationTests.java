package com.zwz.jxone;

import com.zwz.jxone.po.ModelPO;
import com.zwz.jxone.po.ModelRulePO;
import com.zwz.jxone.service.ModelRuleService;
import com.zwz.jxone.service.ModelService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class RealRiskApplicationTests {
	@Autowired
	private ModelRuleService modelRuleService;
	@Autowired
	private ModelService modelService;

	@Test
	void contextLoads() {
		ModelPO modelPo = modelService.servicByid(1);
		System.out.println(modelPo);
	}

}
