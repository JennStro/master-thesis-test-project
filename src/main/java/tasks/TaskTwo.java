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

    // You should *not* change the Bag class in this task
    public class Bag {

        private int size;

        public Bag(int size) {
            this.size = size;
        }

        public boolean equals(Object other) {
            if (other instanceof Bag) {
                return ((Bag) other).size == this.size;
            }
            return false;
        }

        public int hashCode() {
            return this.size;
        }

    }

    public void doIt() {
        // Two equal bags, because they have the same size.
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);

        // TODO: TASK 2
        // TODO: How can the condition "bag1 == bag2" be false? Give your answer in the form.
        // TODO: Change the condition such that the bags are compared correctly. (You should *not* make changes to the class Bag here!)
        if (bag1 == bag2) {
            System.out.println("bag1 1 is equal to bag2, good job! :)");
        } else {
            System.out.println("bag1 1 is not equal to bag2!");
        }
    }

}
