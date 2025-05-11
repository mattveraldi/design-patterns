package computer;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class SdkBuilderExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.google.it"))
                .header("Accept", "text/html")
                .GET()
                .build();

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(200))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.err.println(response.body());
    }
}
