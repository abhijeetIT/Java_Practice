package src.main.java.JavaBasic.InterviewPractice.Arrays;


public class FindMissingNumberInArray {
    public static int FindMissing(int[] arr,int n){
        int ExpectedSum = n * (n+1) /2; //  6 * (6+1) /2 = 42/2 = 21
        int ActualSum = 0;
        for (int i : arr) {
            ActualSum+=i;
        }
        return ExpectedSum - ActualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};

       System.out.println( "The missign number is : "+FindMissing(arr,6));
    }
}

//very important 

/*🔹 Complexity

Time Complexity: O(n) → only one loop.

Space Complexity: O(1) → no extra space. */