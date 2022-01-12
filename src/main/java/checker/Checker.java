package checker;

import filewriter.WriteToFile;
import tasks.*;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

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


        try {
            URL url = new URL("https://master-thesis-web-backend.herokuapp.com/analyse");
            URLConnection con = null;
            con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            http.connect();

            FileReader file = new FileReader("src/main/java/tasks/TaskOne.java");
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
            System.out.println(response);
            if (response.contains("errors")) {
                System.out.println("FAIL");
            }

        } catch (IOException e) {
            e.printStackTrace();
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
