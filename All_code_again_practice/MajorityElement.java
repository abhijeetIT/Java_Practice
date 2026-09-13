package src.main.java.JavaBasic.All_code_again_practice;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3,3,4,4,6,7,85,555,667,667,667,667};

        int count = 0, ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ans = arr[i];
                count = 1;
            } else if (arr[i] == ans) {
                count++;
            } else {
                count--;
            }
        }

        System.out.printf("The majority element is %d%n", ans);
    }
}

