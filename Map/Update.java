package JavaBasic.HashMap_dict;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Update {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Object> user = new HashMap<>(){{
            System.out.print("Enter student name: ");
            put("name",br.readLine());
            System.out.print("Enter Student DOB(DD-MM-YYYY) Format: ");
            put("dob", br.readLine());
            System.out.print("Enter Streem: ");
            put("stream", br.readLine());
            System.out.print("Enter Student Contact Number: ");
            put("contact", Long.parseLong(br.readLine()));
        }};

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + user.get("name"));
        System.out.println("DOB: " + user.get("dob"));
        System.out.println("Stream: " + user.get("stream"));
        System.out.println("Contact: " + user.get("contact"));
    }

    
}
