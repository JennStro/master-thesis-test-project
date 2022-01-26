package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.ArrayList;

@NoEqualsMethod
public class TaskFive {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        TaskFive taskFive = new TaskFive();
        taskFive.doIt(false);
        Checker.checkTaskFive();
    }

    private ArrayList<Integer> list = new ArrayList<>();

    public void doIt(boolean shouldAddToList) {
        list = new ArrayList<>();

        // TODO: TASK 5
        // TODO: The boolean shouldAddToList is false, so why does it still add numbers to the list? Answer in the form.
        // TODO: Make changes to the if-statement below such that no numbers are added to the list. (Both numbers should be added if shouldAddToList is true!)
        if (shouldAddToList)
            list.add(1);
            list.add(2);

        // This should *not* be changed in this task!
        if (list.isEmpty()) {
            System.out.println("Woho, the list is empty!");
        } else {
            System.out.println("This list should be empty, but is " + list);
            Checker.tell("This list should be empty, but is " + list);
        }
    }
}
