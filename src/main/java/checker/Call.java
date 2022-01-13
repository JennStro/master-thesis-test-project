package checker;

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;

public class Call extends Thread{

    public String fileName;
    private Optional<String> response = Optional.empty();

    @Override
    public void run() {
       this.response = getResponse(fileName);
    }

    public boolean hasResponse() {
        return response.isPresent();
    }
    public Optional<String> getResponse() {
        return response;
    }

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
