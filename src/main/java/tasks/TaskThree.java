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
        String s = "Java";
        s.toUpperCase();

        if ("JAVA".equals(s)) {
            System.out.println("Output: " + s + " is correct!");
        } else {
            System.out.println("Output: " + s + " should be JAVA!");
        }
    }

}
