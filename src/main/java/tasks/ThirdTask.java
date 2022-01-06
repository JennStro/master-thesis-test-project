package tasks;

import annotations.NoEqualsMethod;
import annotations.NoInitialization;
import results.WriteToFile;

import java.util.ArrayList;
@NoEqualsMethod
public class ThirdTask {

    @NoEqualsMethod
    public class Bar {

        @NoInitialization
        private ArrayList<String> glasses;

        public boolean canPourDrinks() {
            return glasses != null;
        }

        public boolean shouldPourDrinks() {
            return glasses.size() > 5;
        }

        public void pourDrinks() {}

    }

    /**
     * This is the method you should change!
     *
     */
    public void ThirdTask() {
        Bar bar = new Bar();
        try {
            if (bar.canPourDrinks() & bar.shouldPourDrinks()) {
                bar.pourDrinks();
            }
            System.out.println("SUCCESS");
            WriteToFile.write("SUCCESS", 3);
        } catch (NullPointerException e) {
            System.out.println("FAIL");
            WriteToFile.write("FAIL", 3);
        }
    }

    public static void main(String[] args) {
        ThirdTask thirdTask = new ThirdTask();
        thirdTask.ThirdTask();
    }

}
