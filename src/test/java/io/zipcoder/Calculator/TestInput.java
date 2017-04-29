package io.zipcoder.Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 4/29/17.
 */
public class TestInput {
 @Test
 public void readMenuChoice() {
     //: Given:  given that a user has a menu option to choose operation from, reader chooses option
     int a = 5;
     int b= 4;
     int expectedResult=9;
     Calculator calculator = new Calculator();


     //: When
     int actualResult= calculator.add(a, b);

     //: Then


     Assert.assertEquals("should return sum of a+b", expectedResult, actualResult);


 }






}
