package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Filter all even numbers
        List<Integer> list1 = List.of(1, 5, 4, 6, 7, 8); // immutable list.

        System.out.println();

        List<Integer> list2 = new ArrayList<>(); // mutable list
        list2.add(1);
        list2.add(3);
        list2.add(6);
        list2.add(8);
        list2.add(2);
        list2.add(5);

        List<Integer> list3 = Arrays.asList(15, 2, 5, 6, 7, 8); // immutable list

        // even numbers from list1 to list4 - using stream

        System.out.println(list1);

        List<Integer> list4 = list1.stream().filter(n -> n%2 == 0).toList();
        System.out.println(list4);

        System.out.println("-----------------------------------------------------");

        // even numbers from list2 to list5 - without stream

        System.out.println(list2);

        List<Integer> list5 = new ArrayList<>();
        for(Integer i : list2){
            if(i%2 == 0){
                list5.add(i);
            }
        }
        System.out.println(list5);

        System.out.println("-----------------------------------------------------");

        // even numbers from list3 to list6 - using stream and collector

        System.out.println(list3);
        List<Integer> list6 = list3.stream().filter(n -> n%2==0).collect(Collectors.toList()); // works the same
        System.out.println(list6);

       // if stream is consumed once it cant be reused
        Stream<Integer> stm1 = list1.stream().filter(n -> n%2 == 0);
        System.out.println(stm1.count());
        //stm1.forEach(System.out::println); // reuse not possible



    }
}