package JavaBasic.input;

import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter password: ");
        
        System.out.println("Name: " + name);
        System.out.println("Password: " + new String(password));
    }
}

/*✅ Pros:

1. Good for secure inputs (passwords)
2. Hides password input

❌ Cons:

1. Does not work in IDEs like Eclipse or VS Code (works in terminal)

➡ Best for: Command-line applications requiring hidden inputs
*/