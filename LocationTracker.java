package src.main.java.JavaBasic;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LocationTracker {

    public static void main(String[] args) {
        // Using a reliable, free HTTPS geolocation API
        String apiUrl = "https://ipapi.co";

        try {
            // Configure the client to follow redirects automatically
            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .header("User-Agent", "Java-HttpClient") // Some servers require a user agent header
                    .build();

            System.out.println("Fetching your location data... Please wait.");

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("\n--- Location Information ---");
                parseAndPrintJson(response.body());
            } else {
                System.out.println("Failed to fetch location. HTTP Error code: " + response.statusCode());
                System.out.println("Response: " + response.body());
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Cleaned native parser compatible with Java 17 text rules.
     */
    private static void parseAndPrintJson(String json) {
        // Clean brackets and quotes
        String cleanJson = json.replace("{", "").replace("}", "").replace("\"", "");
        String[] pairs = cleanJson.split(",");

        boolean foundData = false;
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length >= 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();

                switch (key) {
                    case "country_name" -> { System.out.println("Country:   " + value); foundData = true; }
                    case "region"       -> { System.out.println("Region:    " + value); foundData = true; }
                    case "city"         -> { System.out.println("City:      " + value); foundData = true; }
                    case "postal"       -> { System.out.println("Zip Code:  " + value); foundData = true; }
                    case "latitude"     -> { System.out.println("Latitude:  " + value); foundData = true; }
                    case "longitude"    -> { System.out.println("Longitude: " + value); foundData = true; }
                    case "ip"           -> { System.out.println("Public IP: " + value); foundData = true; }
                }
            }
        }

        // Fallback: If our custom parser missed the tags, print the raw string to debug
        if (!foundData) {
            System.out.println("Raw Server Response: \n" + json);
        }
    }
}