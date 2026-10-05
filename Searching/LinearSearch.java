package main.java.JavaBasic.Searching;

public class LinearSearch {
     public static void main(String[] args) {
        
          int[] arr = {1,232,12,2,13,31,3441,313,3435};
          int target = 10;
          int pos=0;
          boolean flag=false;

          for(int i=0 ; i<arr.length ; i++){
               if(arr[i] == target){
                    pos=i;
                    flag=true;
                    break;
               }
          }
          if (flag) {
               System.out.println(pos);
          } else {
               System.out.println("Not found");
          }


     }
}
