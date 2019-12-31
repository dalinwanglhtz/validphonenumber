package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Kata;

class PhoneExampleTests {

	@Test
	  public void tests() {
	    assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
	    assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
	    assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
	  }

}
