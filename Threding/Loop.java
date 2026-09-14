public class Loop {
    public static void main(String[] args) {
        // First Thread using Lambda
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2: " + i); 
            }
        });

        t.start();
        t2.start();
        
    }
}