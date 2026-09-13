package JavaBasic.OOP;

class Std {
    String name;
    String gender;
    int age;
    static String schoolName = "Bengal School of Technology & Management"; // Made static

    // Constructor
    Std(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Method to display student info
    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("College Name: " + schoolName); // No need for 'this'
        System.out.println();
    }
}

public class StaticDemo {  // Renamed from STATIC
    public static void main(String[] args) {
        Std s1 = new Std("Abhijeet Jha", "Male", 19);
        s1.info();

        Std s2 = new Std("Gautam Jha", "Male", 22);
        Std.schoolName = "BSTM";  // Changing static variable correctly
        s2.info();
        s1.info();  // Now s1 will also reflect "BSTM"
    }
}
