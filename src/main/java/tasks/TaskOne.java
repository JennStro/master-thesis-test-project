package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class TaskOne {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        taskOne.doIt(false);
        Checker.checkTaskOne();
    }

    public void doIt(boolean value) {
        // TODO: How can the text be printed even though value is always false? Answer in the form.
        // TODO: Change the if-statement such that nothing prints! (value should always be false).
        // TODO: Stuck? Get help by copying this whole file (Ctrl/Cmd+A then Ctrl/Cmd+C) into https://master-thesis-frontend-prod.herokuapp.com/
        if (value); {
            System.out.println("Uh oh, this should not print when value is "+ value +"!");
            Checker.tell("Uh oh, this should not print when value is "+ value +"!");
        }
    }

}
