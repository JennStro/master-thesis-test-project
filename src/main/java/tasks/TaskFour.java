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
        // TODO: How can we get an ArrayIndexOutOfBoundsException even though we check that the list "strings" is not empty? Answer in the form.
        // TODO: Change the if-condition "(strings.length > 0 & strings[0].equals("java"))" such that the ArrayIndexOutOfBoundsException is avoided. (The list *should* be empty!)
        // TODO: Stuck? Get help by copying this whole file (Ctrl/Cmd+A then Ctrl/Cmd+C) into https://master-thesis-frontend-prod.herokuapp.com/
        String[] strings = new String[]{};
        if (strings.length > 0 & strings[0].equals("java")) {
            System.out.println("Uh oh, we should have an empty list!");
            Checker.tell("Uh oh, we should have an empty list!");
        } else {
            System.out.println("Woho! You avoided the ArrayIndexOutOfBoundsException, good job! :)" );
        }
    }

}
