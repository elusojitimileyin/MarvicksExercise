package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.ObjLongConsumer;

public class myObjLongCustomer {
    public static void main(String[] args) {
        ObjLongConsumer<String> objLongConsumer =  (name, number) -> System.out.println(name);
        objLongConsumer.accept("name", 123456789);
    }
}
