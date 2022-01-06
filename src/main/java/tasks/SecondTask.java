package tasks;

import annotations.NoEqualsMethod;
import results.WriteToFile;

/**
 * You have a new bag. Two bags are equals if it has the same size. You should
 * make chances to the method secondTask() such that the code below prints "SUCCESS".
 */
@NoEqualsMethod
public class SecondTask {

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

    }

    /**
     * The method you should change!
     */
    public void secondTask() {
        Bag bag1 = new Bag(5);
        Bag bag2 = new Bag(5);
        boolean theBagsAreEqual = bag1 == bag2;
        if (theBagsAreEqual) {
            System.out.println("SUCCESS");
            WriteToFile.write("SUCCESS", 2);
        } else {
            System.out.println("FAIL");
            WriteToFile.write("FAIL", 2);
        }
    }

    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.secondTask();
    }

}
