package io.zipcoder.Calculator;


public class Instruction {

    Input input;

    public Instruction(){
        input = new Input();
    }

    public void tellMenuChoice(){
        System.out.println("Choose a menu option:\n" +
                "1: Add\n" +
                "2: Subtract\n" +
                "3: Multiply\n" +
                "4:Divide\n"  +
                "5:Find square root of a number\n" +
                "6: Square a number\n"+
                "7:Calculate Variable Exponentiation\n" +
                "8:Calculate Inverse\n" +
                "9:Calculate Additive Inverse\n");


    }

    public int TellOneNumber(){
        System.out.println("Enter your number");
        return input.takeUserInt();
    }


}
