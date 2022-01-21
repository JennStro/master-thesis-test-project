package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class TaskThree {

    public static void main(String[] args) {
        TaskThree taskThree = new TaskThree();
        taskThree.doIt();
        Checker.checkTaskThree();
    }

    /**
     * This is the method you should change!
     *
     */
    public void doIt() {
        int a = 7;
        int b = 5;

        if (a/b == 1.4) {
            System.out.println("Woho, a/b has the correct value!");
        } else {
            System.out.println("Oh no, a/b should be " + 1.4);
        }
    }

}
