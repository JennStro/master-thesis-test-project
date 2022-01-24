package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class TaskFour {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskFour taskFour = new TaskFour();
        taskFour.doIt();
        Checker.checkTaskFour();
    }

    public void doIt() {
        // TODO: TASK 4
        // TODO: How can strings[0].equals("java") be executed (this is why we get an ArrayIndexOutOfBoundsException) even though the list "strings" is empty? Answer in the form.
        // TODO: Change the if-condition such that strings[0].equals("java") not get executed when the list is empty. (The list *should* be empty!)
        String[] strings = new String[]{};
        if (strings.length > 0 & strings[0].equals("java")) {
            System.out.println("Uh oh, we should have an empty list!");
        } else {
            System.out.println("Woho! You avoided the ArrayIndexOutOfBoundsException, good job! :)" );
        }
    }

}
