import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class WriteToFile {

    public static void write(String status, int taskNumber) {

        try {
            FileWriter file = new FileWriter("savedData.csv", true);
            Long datetime = System.currentTimeMillis();
            Timestamp timestamp = new Timestamp(datetime);
            String row = "Task " + taskNumber + "," + timestamp + "," + status + "\n";
            file.write(row);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
