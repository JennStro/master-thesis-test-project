package tasks;

import annotations.NoEqualsMethod;
import results.WriteToFile;

import java.util.ArrayList;

/**
 * You should make changes to tasks.FivthTask such that the code below prints SUCCESS!
 */
@NoEqualsMethod
public class FivthTask {

    /**
     * This is the method you should change!
     * @param shouldAddToList
     * @return
     */
    public ArrayList<String> fivthTask(boolean shouldAddToList) {
        ArrayList<String> list = new ArrayList<>();
        if (shouldAddToList)
            list.add("1");
            list.add("2");
        return list;
    }
    public static void main(String[] args) {
        FivthTask fivthTask = new FivthTask();
        ArrayList<String> list = fivthTask.fivthTask(false);
        if (list.size() != 0) {
            System.out.println("FAIL");
            WriteToFile.write("FAIL", 5);
        } else {
            System.out.println("SUCCESS");
            WriteToFile.write("SUCCESS", 5);
        }
    }
}
