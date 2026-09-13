package JavaBasic.HashMap_dict;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInput {
            public static void main(String[] args) throws IOException  {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                HashMap<String,Object> user= new HashMap<>(){{
                        System.out.print("Enter Your name: ");
                        put("name", br.readLine());
                           System.out.print("Enter you age: ");
                        put("age", Integer.parseInt(br.readLine()));
                }};
                 System.out.println(user);
                 System.out.println(user.values());
            }
}
