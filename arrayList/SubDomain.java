package JavaBasic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SubDomain {
    public static void main(String[] args) {

        ArrayList<String> links = new ArrayList<>(Arrays.asList("www.Google.com", "www.youtube.com", "www.facebook.com", "www.instagram.com", "www.linkedin.com"));
        ArrayList<String> sub_domain = new ArrayList<>();
    
        for(String link : links){
            sub_domain.add(link.substring(4));                                                                      
          }
          for(String link:sub_domain){
            System.out.println(link);
          }
        }
}
