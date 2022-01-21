package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.doIt(false);
        Checker.checkDemo();
    }

    private void doIt(boolean bool) {
        if (bool) ;{
            System.out.println("Uh oh, this should not print!");
        }
    }

}
