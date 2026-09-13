package JavaBasic.API_handling;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class one {
    static class GitHubUser {
        public String login;
        public String type;
        public String name;
        public int public_repos;
        public String avatar_url;
        public int followers;
        public int following;
        public String created_at;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your gitHub username: ");
        String userName = br.readLine();
      var api = "https://api.github.com/users/"+userName;

  try{
     HttpRequest request = HttpRequest.newBuilder()
             .GET()
             .uri(new URI(api))
             .build();

     HttpClient client = HttpClient.newHttpClient();
     HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//     System.out.println("Response: "+response.body());

     Gson gson = new Gson();
     GitHubUser user = gson.fromJson(response.body(),GitHubUser.class); //Converting GSON to Class
      System.out.println("-------------------------------------------\n");
      System.out.println("Account Created : "+user.created_at);
      System.out.println("Username: "+user.login);
      System.out.println("Name: "+user.name);
      System.out.println("Type: "+user.type);
      System.out.println("Profile Pic: "+user.avatar_url);
      System.out.println("Followers: "+user.followers+","+"Following: "+user.following);
      System.out.println("Total Public Repository: "+user.public_repos);
      System.out.println("-----------------------------------------------------------------------\n");

  }catch (Exception e){
     System.out.println("Request failed! Error : "+e.getMessage());
  }


   }
}
