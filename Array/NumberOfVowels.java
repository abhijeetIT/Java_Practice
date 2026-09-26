import java.util.ArrayList;
import java.util.List;

public class NumberOfVowels {

    public static int countVowels(String str){
        int count=0;

        List<Character> vowelsList = List.of('a','e','i','o','u','A','E','I','O','U');

        for(int i=0;i<str.length();i++){
            if(vowelsList.contains(str.charAt(i))){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println("Total vowels in the list: "+countVowels("Abhijeet"));
        
    }
}
