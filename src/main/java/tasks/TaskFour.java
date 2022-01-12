package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.ArrayList;

@NoEqualsMethod
public class TaskFour {

    private Bag bag;

    public static void main(String[] args) {
        TaskFour taskFour = new TaskFour();
        taskFour.doIt();
        Checker.checkTaskFour();
    }

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
        bag = new Bag();

        if (bag.getContent() == null) {
            System.out.println("FAIL");
        } else {
            System.out.println("SUCCESS");
        }
    }


    public Bag getBag() {
        return this.bag;
    }

}
