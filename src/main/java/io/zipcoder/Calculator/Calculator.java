package io.zipcoder.Calculator;

/**
 * Created by mollyarant on 4/28/17.
 */
import static java.lang.Math.*;
public class Calculator {
    public int add(int a, int b){
        int result=0;
        result=a+b;
        return result;
    }
    public int subtract(int a, int b){
        int result=0;
        result=a-b;
        return result;
    }
    public int multiply(int a, int b){
        int result=0;
        result=a*b;
        return result;
    }
    public int divide(int a, int b){
        int result=0;
        result=a/b;
        return result;
    }
    public double calculateSquareRoot(double a){
        double result=0;
        result=Math.sqrt(a);
        return result;
    }
    public double calculateSquareNumber(double a){
        double result=0;
        result= a*a;
        return result;
    }
    public double calculateVariableExponentiation(double a, double b){
        double result=0;
        result= Math.pow(a,b);
        return result;
    }
    public double calculateInverse(double a){
        double result=0;
        result= Math.pow(a, -1);
        return result;
    }
    public int calculateAdditiveInverse(int a){
        int result=0;
        result=a*-1;
        return result;
    }







}
