package src.main.java.JavaBasic.Searching;

public class BinarySearch {

    public static void BinarySerching(int[] arr, int key){
          int start=0,end=arr.length-1,mid=0;

          while(start <= end){
            mid=start+(end-start)/2;

            if(arr[mid] == key){
                System.out.println("Element found at index "+mid);
                return;
            }else if(arr[mid] > key){
               end=mid-1;
            }else{
                start=mid+1;
            }
          }
          System.out.println("Element not founded...!!");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,34,55,64,234,454,467,1234,2312,3432,5543};

        BinarySerching(arr,34);
    }
}
