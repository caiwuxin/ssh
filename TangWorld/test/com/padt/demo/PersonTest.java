package com.padt.demo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padt.demo.Person;


public class PersonTest {
	Person person;
	@Before
	public void setUp() throws Exception {
		//加载beans.xml配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/padt/demo/bean.xml");
		person = (Person) applicationContext.getBean("person");
	}
	@Test
	public void nameExport()
	{
		int cout=person.getHands();
		System.out.println("人有"+cout+"只手");
	}
}
