package tasks;

import annotations.NoEqualsMethod;
import results.WriteToFile;

import java.util.ArrayList;

/**
 * You have to make changes to the class tasks.FourthTask such that the code below prints "SUCCESS."
 */
@NoEqualsMethod
public class FourthTask {

    private ArrayList<String> list;

    public void addToList(String word) {
        try {
            this.list.add(word);
            System.out.println("SUCCESS");
            WriteToFile.write("SUCCESS", 4);
        }
        catch (NullPointerException e) {
            System.out.println("FAIL");
            WriteToFile.write("FAIL", 4);
        }
    }

    public static void main(String[] args) {
        FourthTask clazz = new FourthTask();
        clazz.addToList("word");
    }

}
