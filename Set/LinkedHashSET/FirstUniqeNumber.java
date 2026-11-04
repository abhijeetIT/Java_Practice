package main.java.JavaBasic.Set.LinkedHashSET;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstUniqeNumber {
    
    public static int firstUniqeElement(int[] nums){

        LinkedHashSet<Integer> uniqeInOrder = new LinkedHashSet<>();
        HashSet<Integer> cheaked = new HashSet<>();

        for(int num : nums){
            if(cheaked.contains(num)){
                uniqeInOrder.remove(num);
            }else{
                cheaked.add(num);
                uniqeInOrder.add(num);
            }
        }

        return uniqeInOrder.isEmpty() ? -1 : uniqeInOrder.getFirst();
    }
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,4,7,12,1,2,3,6};

        System.out.println("First Uniqe Element = "+firstUniqeElement(arr));
    }
}
