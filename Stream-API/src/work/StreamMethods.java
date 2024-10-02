package work;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> CityNames = List.of("Mumbai", "Delhi", "Pune", "Bangalore", "Chennai", "Kolkata");

        //Filter (predicate)
            //boolean value function
                //Recommended to use lambda

        CityNames.stream().filter(n -> n.startsWith("M")|| n.startsWith("n", 2)).forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        //Map(Function)
            //returns value
                //each element operation
        CityNames.stream().map(n -> n+" City").sorted().forEach(System.out::println);

        //Collect (returns filtered list
            // returns specified type of data
        List<String> list1 = CityNames.stream().filter(n -> n.contains("a")).collect(Collectors.toList());   //or just CityNames.stream().filter(n -> n.contains("a")).toList();
        Set<String> set1 = CityNames.stream().filter(n -> n.contains("n")).collect(Collectors.toSet());
        Map<String, String> map1 = CityNames.stream().filter(n -> n.contains("u") || n.contains("o")).collect(Collectors.
                                                                                            toMap( a -> a,
                                                                                                   a -> a+" Green City"));
        System.out.println("-----------------------------------------------------");

        list1.forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        set1.forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        map1.forEach((a,b) -> System.out.println(a+" :- "+ b));

        System.out.println("-----------------------------------------------------");

        //forEach method
            //Iterates over each element of given collection/element of object
                    // we can do operations using for each on individual element

        Map<String, String> map2 = CityNames.stream().filter(n -> n.contains("e") || n.contains("a")).collect(Collectors.
                toMap( a -> a,
                        a -> a+" is in India"));

        map2.forEach((a,b) -> System.out.println(a+" :- "+b+ "length is :- "+ a.length()));

        System.out.println("-----------------------------------------------------");


        CityNames.stream().filter(n -> n.contains("e") || n.contains("a")).collect(Collectors.
                toMap( a -> a,
                        a -> a+" is in India")).forEach((a,b) ->System.out.println(a+" :- "+b+ "length is a:- "+ a.length()+ " and b:- "+b.length()));


        System.out.println("-----------------------------------------------------");

        //Sorted elements
           //returns a stream of sorted elements
        CityNames.stream().sorted().forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        List<Integer> lst1 = List.of(5,6,8,4,1,8,9);
        System.out.println(lst1.stream().min((a,b) -> a.compareTo(b)).get());

        System.out.println("-----------------------------------------------------");

        System.out.println(lst1.stream().min(Integer::compareTo).get());

        System.out.println("-----------------------------------------------------");

        System.out.println(lst1.stream().max(Integer::compareTo).get());

        System.out.println("-----------------------------------------------------");

        System.out.println(lst1.stream().max((a,b) -> a.compareTo(b)).get());




    }
}
