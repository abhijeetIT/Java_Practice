public class Loop {
    public static void main(String[] args) {
        // First Thread using Lambda
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1: " + i);
            }
        });

        // Second Thread using Lambda (Fixed Line 10)
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2: " + i); // Changed to Task 2 for clarity
            }
        });

        t.start();
        t2.start();
        
    }
}