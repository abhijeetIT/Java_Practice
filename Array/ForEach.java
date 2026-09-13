package JavaBasic.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEach {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Size of you family: ");
        int size = Integer.parseInt(br.readLine());

        String[] family = new String[size];

        for(int i = 0; i < family.length ; i++){
            System.out.print("Enter family name : ");
            family[i] = br.readLine();
        }
        for (String name : family) {
            System.out.println(name);
        }
    }
}
