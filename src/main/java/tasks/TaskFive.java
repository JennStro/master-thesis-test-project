package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

import java.util.ArrayList;

@NoEqualsMethod
public class TaskFive {

    public static void main(String[] args) {
        TaskFive taskFive = new TaskFive();
        taskFive.doIt(false);
        Checker.checkTaskFive();
    }

    private ArrayList<String> list = new ArrayList<>();

    public void doIt(boolean shouldAddToList) {
        ArrayList<String> list = new ArrayList<>();
        if (shouldAddToList)
            list.add("1");
            list.add("2");

        if (list.isEmpty()) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }

    public ArrayList<String> getList() {
        return list;
    }
}
