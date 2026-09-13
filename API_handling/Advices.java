package JavaBasic.API_handling;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Advices {

    // Outer JSON object
    static class AdviceResponse {
        Slip slip;
    }

    // Inner "slip" object
    static class Slip {
        int id;
        String advice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        String num = sc.next();

        String api = "https://api.adviceslip.com/advice/" + num;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI(api))
                    .build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            AdviceResponse result = gson.fromJson(response.body(), AdviceResponse.class);

            System.out.println("🧠 Best Advice for You: " + result.slip.advice);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
