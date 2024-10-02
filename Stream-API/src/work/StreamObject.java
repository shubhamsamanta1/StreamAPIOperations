package work;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {
        // Stream API - collection process
        //Collection / group of objects

        //blank stream
        Stream<Integer> stm1 = Stream.empty();

        // converting array to stream
        String names[] = {"Shubham", "Tanmay" , "Ajay", "Jay", "Siddhesh", "Namrata", "Amrita"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(n -> System.out.println(n));
        System.out.println("-----------------------------------------------------");
        //Builder pattern
        Stream<Object> buildStream = Stream.builder().build();

        //arrays stream
        IntStream stream = Arrays.stream(new int[]{15, 2, 5, 6, 7, 8});
        stream.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        // list , set objects

        //list object to stream object
        List<Integer> list2 = new ArrayList<>(); // mutable list
        list2.add(1);
        list2.add(3);
        list2.add(6);
        list2.add(8);
        list2.add(2);
        list2.add(5);

        Stream<Integer> stm3 = list2.stream();
        stm3.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        //Set object to stream object
        Set<Integer> set1 = new HashSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(4);
        set1.add(5);
        set1.add(2);
        set1.add(9);

        Stream<Integer> stm4 = set1.stream();
        stm4.forEach(System.out::println);



    }
}
