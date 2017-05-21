package com.sm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sm.dao.UserMap;

@RunWith(SpringJUnit4ClassRunner.class)//使用spring的测试框架
@ContextConfiguration("/beans.xml")//加载spring的配置文件
public class TextSM {
	@Autowired
	private UserMap userMapper;
	@Test
	public void testAdd(){
		userMapper.findAll();
	}
}
