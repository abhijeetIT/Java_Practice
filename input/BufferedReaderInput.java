package JavaBasic.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(br.readLine()); // Must parse manually
        
        System.out.print("Enter a full name: ");
        String name = br.readLine();
        
        System.out.println("Integer: " + num);
        System.out.println("Name: " + name);
    }
}
/* 
Faster than Scanner
More memory-efficient

Only reads Strings, so numbers must be converted manually using Integer.parseInt() or Double.parseDouble().

Best for: Large programs, file handling, or situations where efficiency matters
*/