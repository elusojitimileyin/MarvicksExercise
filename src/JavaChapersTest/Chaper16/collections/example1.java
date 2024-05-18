package JavaChapersTest.Chaper16.collections;

import java.util.*;

public class example1 {

//    generics collection can only work with objects.
//    generic collection don't work with primitive types
//
//    8 wrapper type in java;
//
//    Boolean --> boolean,
//    Byte --> byte,
//    Short --> short,
//    Character --> char,
//    Integer --> int,
//    Long --> long,
//    Float --> float,
//    Double --> double
    public static void main(String[] args) {
////        Autoboxing.... when the JVM converting a primitive type into a equivalent reference type.
//        boolean b = true;
////         vice versa
//        Boolean b2 = b;
//        Collection<Boolean> transactions = new ArrayList<>();
//        transactions.add(b);
//
////        examples 2
//        char c = '0';
//        Character b1 = c;
//        System.out.println("char" + c);
//        System.out.println("Character" + b1);

//
//        Collection<String> words = new TreeSet<>();
//        words.add("Happy");
//        words.add("Happy");
//        words.add("Happy");
//        words.add("Happy");
//
//        System.out.println(words);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(4);
    numbers.add(4);
    numbers.add(8);
    numbers.add(5);
    List<Integer> numbers2= new ArrayList<>();
    numbers2.add(5);
    numbers2.add(8);
    numbers2.add(4);
    numbers2.add(4);
    Set<List<Integer>> set = new HashSet<>();
    set.add(numbers);
        set.add(numbers2);

        System.out.println(set);
    }
}
