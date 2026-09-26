package main.java.JavaBasic.Array;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {21, 3, 2, 1, 343, 42, 34, 4312};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}