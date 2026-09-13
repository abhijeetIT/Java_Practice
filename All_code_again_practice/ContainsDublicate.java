package src.main.java.JavaBasic.All_code_again_practice;

import java.util.HashSet;

public class ContainsDublicate {

    public static String isContainDeblicate(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        Boolean flag = true;
        for(int i:arr){
            if (! hs.contains(i)){
                hs.add(i);
            }else{
                flag= false;
                break;
            }
        }
        
        return flag?"not contains dublicate":"contains dublicate";

    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,5,6,7,8,9};

        System.out.println(isContainDeblicate(arr));
    }
}
