package tasks;

import results.WriteToFile;

public class Checker {

    enum STATUS {
        SUCCESS,
        FAIL
    }

    public static void checkTaskOne() {
        TaskOne taskOne = new TaskOne();
        TaskOne.Bag bag1 = taskOne.new Bag(4);
        TaskOne.Bag bag2 = taskOne.new Bag(4);

        if (bag1.equals(bag2)) {
            WriteToFile.write(STATUS.SUCCESS.toString(), 1);
        } else {
            WriteToFile.write(STATUS.FAIL.toString(), 1);
        }
    }

    public static void checkTaskTwo() {
        TaskTwo taskTwo = new TaskTwo();

        if (taskTwo.theBagsAreEqual()) {
            WriteToFile.write(STATUS.SUCCESS.toString(), 2);
        } else {
            WriteToFile.write(STATUS.FAIL.toString(), 2);
        }
    }

    public static void checkTaskThree() {
        TaskThree taskThree = new TaskThree();

        if ("JAVA".equals(taskThree.getString())) {
            WriteToFile.write(STATUS.SUCCESS.toString(), 3);
        } else {
            WriteToFile.write(STATUS.FAIL.toString(), 3);
        }
    }

    public static void checkTaskFour() {
        TaskFour taskFour = new TaskFour();
        taskFour.doIt();
        TaskFour.Bag bag = taskFour.getBag();

        if (bag.getContent() != null) {
            WriteToFile.write(STATUS.SUCCESS.toString(), 4);
        } else {
            WriteToFile.write(STATUS.FAIL.toString(), 4);
        }
    }

    public static void checkTaskFive() {
        TaskFive taskFive = new TaskFive();
        taskFive.doIt(false);

        if (taskFive.getList().isEmpty()) {
            WriteToFile.write(STATUS.SUCCESS.toString(), 5);
        } else {
            WriteToFile.write(STATUS.FAIL.toString(), 5);
        }
    }
}
