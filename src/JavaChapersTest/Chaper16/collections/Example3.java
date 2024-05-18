package JavaChapersTest.Chaper16.collections;

import java.util.ArrayList;
import java.util.Collection;

public class
Example3 {
    public static void main(String[] args) {

//        Collection<Integer> names = new ArrayList<>();
//        names.add(1);
//        names.add(2);
//        names.add(3);
//        names.add(4);
//
//        System.out.println(names);
//        names.remove(2);
//        System.out.println(names);
        Collection<Integer> names = new ArrayList<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);

        System.out.println(names);
        names.remove((Integer) 2);
        System.out.println(names);
    }
}
