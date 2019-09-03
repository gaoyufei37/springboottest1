package com.example.springboottest1;

import com.example.springboottest1.entity.userTable;
import com.example.springboottest1.service.UserTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboottest1ApplicationTests {

	@Autowired
	private UserTableService userTableService;
	@Test
	public void contextLoads() {
		userTable userTable=userTableService.selectByPrimaryKey("1");
		System.out.println(userTable);
	}

}
