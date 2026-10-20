import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NagativeNumberInEveryWIndow {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};

        int windowSize=3;

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0 ; i < windowSize ; i++){
            if(arr[i] < 0){
                q.offer(arr[i]);
            }
            ans.add(q.isEmpty()? 0 : q.peek());
        }

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < 0){
                q.offer(arr[i]);
            }
            if(arr[i+windowSize-1] < 0){
                q.offer(arr[i]);
            }
            ans.add(q.isEmpty()? 0 : q.peek());
        }

        System.out.println(ans);
    }
}
