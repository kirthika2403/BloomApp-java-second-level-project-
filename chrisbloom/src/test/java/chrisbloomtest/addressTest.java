package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.LoginPage;

public class addressTest {

	@Test
	public void test1() {

		//Test case1 - valid details
		
		String address="2/31, krishna Nagar, Vanagaram";
		String city="VIRUDHUNAGAR";
		boolean valid=LoginPage.getAddress(city,address);
		assertEquals(true,valid);
	}
	@Test
	public void test2() {
		
		//Test case 2- invalid address
		
		String address1="       ";
		String city1="Virudhunagar";
		boolean valid=LoginPage.getAddress(city1,address1);
		assertEquals(false,valid);
	}
	
	@Test
	public void test3() {
		
		//Test case 3- invalid city
		
		String address2="2/31, krishna Nagar, Vanagaram";
		String city2="Virudhuna";
		boolean valid=LoginPage.getAddress(city2,address2);
		assertEquals(false,valid);
	}

}
