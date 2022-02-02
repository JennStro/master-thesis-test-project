package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class TaskTwo {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskTwo taskTwo = new TaskTwo();
        taskTwo.doIt();

        Checker.checkTaskTwo();
    }

    public class Bag {

        private int size;

        public Bag(int size) {
            this.size = size;
        }

    }

    public void doIt() {
        // Two equal bags, because they have the same size.
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);

        // TODO: TASK 2
        // TODO: What method is the Bag class missing so that you can compare two bags? How can the condition "bag1 == bag2" be false? Give your answer in the form.
        // TODO: Change the condition such that the bags are compared correctly. Implement the missing method in class Bag above.
        // TODO: Stuck? Get help by copying this whole file (Ctrl/Cmd+A then Ctrl/Cmd+C) into https://master-thesis-frontend-prod.herokuapp.com/
        if (bag1 == bag2) {
            System.out.println("bag1 is equal to bag2, good job! :)");
        } else {
            System.out.println("bag1 is not equal to bag2!");
            Checker.tell("bag1 is not equal to bag2!");
        }
    }

}
