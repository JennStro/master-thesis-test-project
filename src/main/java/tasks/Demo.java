package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class Demo {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.doIt(false);
        Checker.checkDemo();
    }

    private void doIt(boolean bool) {
        // TODO: DEMO
        // TODO: How can the statement be printed when doIt is given false as input on line 12?
        if (bool) ;{
            System.out.println("Uh oh, this should not print!");
        }
    }

}
