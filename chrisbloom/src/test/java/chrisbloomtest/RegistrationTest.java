package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.LoginPage;

public class RegistrationTest {

	@Test
	public void test1() {

		// test case 1 - correct details

		String userId = "Christina";
		String password = "anitsirhc";
		boolean valid = LoginPage.regVerification(userId, password);
		assertEquals(true, valid);
	}

	@Test
	public void test2() {

		// test case 2 - invalid user name

		String userId1 = "abi";
		String password1 = "12345677";
		boolean valid = LoginPage.regVerification(userId1, password1);
		assertEquals(false, valid);
	}

	@Test
	public void test3() {

		// test case 3 - invalid password

		String userId2 = "abinaya";
		String password2 = "tyuh";
		boolean valid = LoginPage.regVerification(userId2, password2);
		assertEquals(false, valid);
	}

	@Test
	public void test4() {

		// test case 3 - invalid password

		String userId3 = "     ";
		String password3 = "    ";
		boolean valid = LoginPage.regVerification(userId3, password3);
		assertEquals(false, valid);

	}
}
