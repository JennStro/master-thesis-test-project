package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.Objects;

/**
 *  You have a class Bag, that contains some items. A bag is equal to another bag
 *  when it has the same content. You should change the class Bag such that the code
 *  below prints "SUCCESS".
 */
@NoEqualsMethod
public class TaskOne {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        taskOne.doIt();
        Checker.checkTaskOne();
    }

    public class Bag {

        private int content = 0;

        public Bag(int content) {
            this.content = content;
        }
    }

    public void doIt() {
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);

        if (bag1.equals(bag2)) {
            System.out.println("bag1 1 is equal to bag2!");
        } else {
            System.out.println("bag1 1 is not equal to bag2! (They should be.)");
        }
    }

}
