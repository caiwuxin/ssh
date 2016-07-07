package com.padt.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.padt.action.AdminAction;

public class JunitTest {
@Test
public void nameConfirm()
{
	AdminAction a=new AdminAction();
	String name=a.test();
	assertEquals("caiwuxin", name);
}

}
