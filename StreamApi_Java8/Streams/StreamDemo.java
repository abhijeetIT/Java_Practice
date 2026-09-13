package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Abhijeet","Priyanshu","Himanshu");
        Stream<String> filteredStream = l.stream()
                                         .filter(x->x.startsWith("A"));

/*  ->Streams are one-time usable — once you call a terminal operation (like toList()), the stream is closed.
         So you cannot reuse filteredStream again.

    ->If you’re using Java 8–15, toList() won’t work — you’d use:
*/

     
        // System.out.println(l+"\n"+filteredStream.toList());  //rather than this we use

        List<String> filterData = filteredStream.toList();

        System.out.println(filterData); // this is a best practice
    }
}
