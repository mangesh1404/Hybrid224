package com.tests;

import java.rmi.server.Skeleton;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listeners.MyListener;
import com.pages.Loginpage;

@Listeners(MyListener.class)
public class LoginTest extends BaseClass {

	Loginpage lp=null;
	@BeforeSuite
	public void setup() throws Exception {
		initialization();
		reportInit();
		lp= new Loginpage(driver);
	}
	@Test
	public void test01() {
		lp.loginToApplication("kiran@gmail.com", "123456");
	}
	
	@Test
	public void test02() {
		System.out.println("test02");
		Assert.assertTrue(false);
	}
	@Test
	public void test03() {
		throw new SkipException("skipping testcase");
	}
}
