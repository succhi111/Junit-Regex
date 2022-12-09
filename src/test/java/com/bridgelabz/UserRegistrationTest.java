package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Suchendra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("suchendra");
           Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validLastName("Mishra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validLastName("mishra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validEmail("such10@.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validMobileNumber("91 72057601");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validMobileNumber("9635867601");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule1("suchend@-k");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule1("suchendra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule2("suchend-k_mishra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule2("such-ch.ra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule3("suche@-endra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule3("such@.dra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule4("suchendra@k");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule4("suchendra23-ak");
        Assert.assertFalse(result);
    }
}