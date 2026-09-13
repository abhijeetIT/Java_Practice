package src.main.java.JavaBasic.InterviewPractice.Arrays;

public class ReverseArray {

    public static void Print(int[] arr){
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }


    public static void Reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println("After reaversed");
    }

    public static void main(String[] args) {
        
        
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("Before a reaverse");
        Print(arr);
        Reverse(arr);
              Print(arr);

    }
}
