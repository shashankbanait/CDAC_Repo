// package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Collection of object ko manipulate karne ke liye stream api build hui hai
public class StreamApiDemo {
    public static void main(String[] args) {
        // List<String> lst = List.of("Ramesh", "Suresh", "Dinesh", "Bhavesh");
        // for(String s : lst){
        //     System.out.println(s);
        // }

    //    lst.stream().forEach(e->System.out.println(e));
    // lst.stream().forEach(System.out::println);

        List<Integer> lst = List.of(12, 11, 10, 34, 25);
        // System.out.println(lst);
        // lst.stream().filter(i->(i%2)==0).collect(Collectors.toList()).forEach(System.out::println);;

        // Map method
        // lst.stream().map(i->i+5).forEach(System.out::println);

        // Set<Integer> st = lst.stream().map(i->i+5).collect(Collectors.toSet());
        // lst.stream().sorted().forEach(System.out::println);

        // lst.stream().sorted((x, y)->y.compareTo(x)).forEach(System.out::println);
        // Integer i= lst.stream().min(x,y)->x.compareTo(y).get();
        // System.out.println(i);


        // naya kuchh
        String arr[] = {"Ramesh", "Suresh", "Dinesh", "Bhavesh"};
        Arrays.stream(arr).filter(e->e.startsWith("R")).forEach(System.out::println);

        
    }
    
}
