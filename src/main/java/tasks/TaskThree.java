package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class TaskThree {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskThree taskThree = new TaskThree();
        taskThree.doIt();
        Checker.checkTaskThree();
    }

    public void doIt() {
        int a = 7;
        int b = 5;

        // TODO: TASK 3
        // TODO: 7/5 = 1.4, so how can the condition "a/b == 1.4" be false? Give your answer in the form.
        // TODO: Change the condition such that "a/b" is equal to 1.4.
        if (a/b == 1.4) {
            System.out.println("Woho, a/b has the correct value!");
        } else {
            System.out.println("Oh no, a/b should be " + 1.4 + " but is " + a/b);
            Checker.tell("Oh no, a/b should be " + 1.4);
        }
    }

}
