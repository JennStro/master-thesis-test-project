package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.ArrayList;

@NoEqualsMethod
public class TaskFour {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskFour taskFour = new TaskFour();
        taskFour.doIt();
        Checker.checkTaskFour();
    }

    // TODO: TASK 4
    // TODO: How can the condition "bag.getContent() == null" on line 45 be true? Answer in the form.
    // TODO: Make changes to the Bag class such that the bag content no longer is null.
    public class Bag {
        private ArrayList<String> content;

        public boolean equals(Object other) {
            if (other instanceof Bag) {
                return ((Bag) other).content.size() == this.getContent().size();
            }
            return false;
        }

        public int hashCode() {
            return this.content.size();
        }

        public ArrayList<String> getContent() {
            return content;
        }

    }

    public void doIt() {
        Bag bag = new Bag();

        if (bag.getContent() == null) {
            System.out.println("Uh oh, the content of the bag should not be null!");
        } else {
            System.out.println("Woho! The content of the bag is not null.");
        }
    }

}
