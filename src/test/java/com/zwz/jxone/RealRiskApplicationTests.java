package com.zwz.jxone;

import com.zwz.jxone.po.ModelPO;
import com.zwz.jxone.po.UserPO;
import com.zwz.jxone.service.ModelRuleService;
import com.zwz.jxone.service.ModelService;
import com.zwz.jxone.service.UserService;
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

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		ModelPO modelPo = modelService.selectById(4);
		System.out.println(modelPo);
		UserPO userPO = userService.selectById(1);
		System.out.println(userPO);
	}

}
