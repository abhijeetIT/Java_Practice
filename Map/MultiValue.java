package JavaBasic.HashMap_dict;

import java.util.*;

public class MultiValue {
    public static void main(String[] args) {
        HashMap<String,Object> user = new HashMap<>(){{
            put("Name","Abhijeet");
            put("Age",19);
            put("gender","Male");
            put("Location","Mumbai");
        }};
    
        System.out.println(user);
    }
}
