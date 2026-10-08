package main.java.JavaBasic.Array;

public class TwoPointer {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int prefix=0;
        int sufix=arr.length-1;
        int target=15;

        while(prefix < sufix){
            int sum = arr[prefix]+arr[sufix];

            if(sum == target){
                System.out.println("First value is = "+prefix+" , second is = "+sufix);
                return;
            }else if(sum > target){
                  sufix--;
            }else{
               prefix++;
            }
        }
    }
}
