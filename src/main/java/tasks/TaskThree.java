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

    private String s;

    /**
     * This is the method you should change!
     *
     */
    public void doIt() {
        s = "Java";
        s.toUpperCase();

        if ("JAVA".equals(s)) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }



    public String getString() {
        return s;
    }

}
