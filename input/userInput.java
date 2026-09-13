package JavaBasic.input;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads an integer

        sc.nextLine(); // Consume the leftover newline character

        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // Reads the full line

        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
/* 
✅ Pros:

Easy to use
Supports different data types (int, float, string, boolean, etc.)
Can read full lines

❌ Cons:

Uses more memory than BufferedReader
Slower compared to BufferedReader

➡ Best for: Small programs, competitive coding, and general input-taking
*/