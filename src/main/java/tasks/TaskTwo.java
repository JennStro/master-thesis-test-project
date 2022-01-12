package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

/**
 * You have a new bag. Two bags are equals if it has the same size. You should
 * make chances to the method doIt() such that the code below prints "SUCCESS".
 */
@NoEqualsMethod
public class TaskTwo {

    public static void main(String[] args) {
        TaskTwo taskTwo = new TaskTwo();
        taskTwo.doIt();

        Checker.checkTaskTwo();
    }

    private boolean theBagsAreEqual;

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

    /**
     * The method you should change!
     */
    public void doIt() {
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);

        theBagsAreEqual = bag1 == bag2;

        if (theBagsAreEqual) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }



    public boolean theBagsAreEqual() {
        return this.theBagsAreEqual;
    }

}
