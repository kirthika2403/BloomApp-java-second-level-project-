package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.LoginPage;

public class LoginTest {

	@Test
	public void test1() {
		
		//test case 1 -with unregistered details
		String userName="christina";
		String password="anitsirhc";
		boolean valid=LoginPage.loginVerification(userName, password);
		LoginPage.regVerification(userName, password);
		System.out.println("********************");
		assertEquals(false,valid);
			
	}
	
	@Test
	public void test2() {
		
	//test case 2- with registered details
		
		String userName="christina";
		String password="anitsirhc";
		boolean valid=LoginPage.loginVerification(userName, password);
		System.out.println("********************");
		assertEquals(true,valid);
		
	}
	
	@Test
	public void test3() {
		
		//Test case 3 - Invalid user name
		
		String userName="ch";
		String password="anitsirhc";
		boolean valid=LoginPage.loginVerification(userName, password);
		LoginPage.regVerification(userName, password);
		System.out.println("********************");
		assertEquals(false,valid);

	}
	
}
