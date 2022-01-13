package checker;

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
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
        Optional<String> response = getResponse(file);

        if (response.isPresent()) {
            if (response.get().contains("\"status\":\"errors\"")) {

                System.out.println("FAIL");
            } else {
                System.out.println("SUCCESS");
            }
        } else {
            System.out.println("FAIL");
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

    private static Optional<String> getResponse(String path) {
        try {
            URL url = new URL("https://master-thesis-web-backend-prod.herokuapp.com/analyse");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection) con;
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Content-Type", "text/plain; charset=UTF-8");
            http.connect();

            FileReader file = new FileReader(path);
            StringBuilder content = new StringBuilder();
            int ch = file.read();
            while (ch != -1) {
                content.append((char) ch);
                ch = file.read();
            }

            try(OutputStream os = http.getOutputStream()) {
                os.write(content.toString().getBytes());
            }
            String response = new String(http.getInputStream().readAllBytes());
            return Optional.of(response);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
