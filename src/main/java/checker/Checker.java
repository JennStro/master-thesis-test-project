package checker;

import java.util.Optional;

public class Checker {

    private final static String TASK_ONE_FILEPATH = "src/main/java/tasks/TaskOne.java";
    private final static String TASK_TWO_FILEPATH = "src/main/java/tasks/TaskTwo.java";
    private final static String TASK_THREE_FILEPATH = "src/main/java/tasks/TaskThree.java";
    private final static String TASK_FOUR_FILEPATH = "src/main/java/tasks/TaskFour.java";
    private final static String TASK_FIVE_FILEPATH = "src/main/java/tasks/TaskFive.java";
    private final static String DEMO_FILEPATH = "src/main/java/tasks/Demo.java";

    enum STATUS {
        SUCCESS,
        FAIL
    }

    private static void checkTask(String file) {

        Call call = new Call();
        call.fileName = file;
        call.start();

        System.out.println("Waiting for analysis.");
        int progressLength = 30;
        int prints = 0;
        while(!call.hasResponse()) {
            System.out.print(".");
            prints+=1;
            if (prints % progressLength == 0) {
                System.out.print("\n");
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Optional<String> response = call.getResponse();
        call.interrupt();

        if (response.isPresent()) {
            if (response.get().contains("\"status\":\"errors\"")) {

                System.out.println("\nFAIL");
            } else {
                System.out.println("\nSUCCESS");
            }
        } else {
            System.out.println("\nFAIL");
        }
    }

    public static void checkTaskOne() {
        checkTask(TASK_ONE_FILEPATH);
    }

    public static void checkTaskTwo() {
        checkTask(TASK_TWO_FILEPATH);
    }

    public static void checkTaskThree() {
        checkTask(TASK_THREE_FILEPATH);
    }

    public static void checkTaskFour() {
        checkTask(TASK_FOUR_FILEPATH);
    }

    public static void checkTaskFive() {
        checkTask(TASK_FIVE_FILEPATH);
    }

    public static void checkDemo() { checkTask(DEMO_FILEPATH); }


}
