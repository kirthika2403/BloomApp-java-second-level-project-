package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.LoginPage;

public class userDetailsTest {

	@Test
	public void correctInputTest() {
		
		//user details with correct input
		
		String userName="christina";
		String password="anitsirhc";
		String mobileNo="8072843568";
		String address="2/31, krishna nagar, Vanagaram";
		String city="Madurai";
		LoginPage.regVerification(userName, password);
		LoginPage.loginVerification(userName, password);
		LoginPage.getMobileNumber(mobileNo);
		LoginPage.getAddress(city, address);
		LoginPage.displayDetails();
		
		String userName1="christy";
		String password1="anitsirhc";
		String mobileNo1="9090909090";
		String address1="2/31, krishna nagar, Vanagaram";
		String city1="Madurai";
		LoginPage.regVerification(userName1, password1);
		LoginPage.loginVerification(userName1, password1);
		LoginPage.getMobileNumber(mobileNo1);
		LoginPage.getAddress(city1, address1);
		LoginPage.displayDetails();
		
		
	}
	
	@Test
	public void incorrectInputTest() {
		
		//user details with incorrect input
		
		String userName1="chr";
		String password1="anitsirhc";
		String mobileNo1="9090909090";
		String address1="2/31, krishna nagar, Vanagaram";
		String city1="Madurai";
		LoginPage.regVerification(userName1, password1);
		LoginPage.loginVerification(userName1, password1);
		LoginPage.getMobileNumber(mobileNo1);
		LoginPage.getAddress(city1, address1);
		LoginPage.displayDetails();
		
	}

}
