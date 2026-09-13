package src.main.java.JavaBasic.InterviewPractice.DSA.String;

import java.util.Scanner;

public class ArmstrongNumberEfficient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }

    // Efficient Armstrong check
    public static boolean isArmstrong(int num) {
        int power = (int) Math.log10(num) + 1;  // count power efficiently
        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);  // digit^power
            temp /= 10;
        }

        return sum == num;
    }
}
