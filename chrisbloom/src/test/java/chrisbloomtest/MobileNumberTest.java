package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.LoginPage;

public class MobileNumberTest {

	@Test
	public void test1() {
		
		// test case-1 Correct mobile number
		
		String mobileNo="8072843568";
		boolean valid=LoginPage.getMobileNumber(mobileNo);
		assertEquals(true,valid);
	}
	
	@Test
	public void test2() {	
		
		// test case-2 InCorrect mobile number
		
		String mobileNo1="67644";
		boolean valid=LoginPage.getMobileNumber(mobileNo1);
		assertEquals(false,valid);
	}
	
	@Test
	public void test3() {	
		
		// test case-3 Already available mobile number
		
		String mobileNo3="8072843568";
		boolean valid=LoginPage.getMobileNumber(mobileNo3);
		assertEquals(false,valid);
	}

}
