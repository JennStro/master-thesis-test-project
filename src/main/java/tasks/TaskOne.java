package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.Objects;

@NoEqualsMethod
public class TaskOne {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        taskOne.doIt();
        Checker.checkTaskOne();
    }

    // TODO: TASK 1
    // TODO: How can the condition "bag1.equals(bag2)" on line 36 be false? Give your answer in the form.
    // TODO: Make changes to the Bag class such that "bag1.equals(bag2)" is true.
    public class Bag {

        private int content = 0;

        public Bag(int content) {
            this.content = content;
        }
    }

    public void doIt() {
        //Two equal bags because they have the same content.
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);

        if (bag1.equals(bag2)) {
            System.out.println("bag1 1 is equal to bag2!");
        } else {
            System.out.println("bag1 1 is not equal to bag2!");
        }
    }

}
