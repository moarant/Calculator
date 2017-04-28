package io.zipcoder.Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 4/28/17.
 */

public class TestCalculator {

    @Test
    public void testAdd() {
        //: Given:  given that two numbers are added together
        int a = 5;
        int b= 4;
        int expectedResult=9;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.add(a, b);

        //: Then

        // ... The result should be the sum of the grade values and divided by # of grades
        Assert.assertEquals("should return sum of a+b", expectedResult, actualResult);


    }

    @Test
    public void testSubtract() {
        //: Given:  given that two numbers are added together
        int a = 6;
        int b= 4;
        int expectedResult=2;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.subtract(a, b);

        //: Then

        // ... The result should be the sum of the grade values and divided by # of grades
        Assert.assertEquals("should return a-b", expectedResult, actualResult);


    }

    @Test
    public void testmultiply() {
        //: Given:  given that two numbers are added together
        int a = 11;
        int b= 2;
        int expectedResult=22;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.multiply(a, b);

        //: Then

        // ... The result should be the sum of the grade values and divided by # of grades
        Assert.assertEquals("should return the product of a and b", expectedResult, actualResult);


    }










}