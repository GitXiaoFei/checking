package lxf.ssm.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import lxf.ssm.service.IUserService;
import lxf.ssm.vo.User;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承这个类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private IUserService userService = null;

	@Test
	public void test() {
		User user = userService.getUserById(1);
		logger.info(user);
		logger.info("user转json");
		logger.info(JSON.toJSON(user));
	}

}
