package io.zipcoder.Calculator;

/**
 * Created by mollyarant on 4/29/17.
 */
public class Main {
    public static void main(String[] args) {
        Instruction instruction = new Instruction();
        Input input = new Input();
        MenuLogic logic= new MenuLogic();


        instruction.tellMenuChoice();
        logic.menuChoice(input.takeUserInt());

    }
}

