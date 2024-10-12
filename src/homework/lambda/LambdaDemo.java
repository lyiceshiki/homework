package homework.lambda;

import java.util.function.*;


public class LambdaDemo {
    /*
     * ()->(****)
     * a -> "TEST";
     * (a) -> (return "TEST")
     * a , b -> {
     *  int a = 1;
     *  return b;
     * }
     */
    public static void main(String[] args) {
        
        func(new Function<Integer , Integer>(){
        @Override
            public Integer apply(Integer a){
                return a + 1;
            }
        });

        func(a -> a + 1);
        
        pre(new Predicate<Integer>() {
            @Override
            public boolean test(Integer a) {
                return a >1;
            }
        });

        pre(a -> a > 1);

        con(new Consumer<Integer>() {
            @Override
            public void accept(Integer a) {
                System.out.println(a);
            }
        });

        con(a -> System.out.println(a));

        sup(new Supplier<Integer>() {
            public Integer get() {
                return 1;
            }
        });

        sup(() -> 1);

        Dog d = new Dog(001, "Bill", 3);
        d.createNamePlate(a -> "ID : " + a.getId() + " Name : " + a.getName() + " Age:" + a.getAge());


    }

    static void func(Function<Integer ,Integer> func) {

    }
    
    static void pre(Predicate<Integer> pre) {

    }

    static void con(Consumer<Integer> con){

    }

    static void sup(Supplier<Integer> sup){

    }

/*
 * break()
 * eat()
 * play()
 * sleep()
 * 
 */
}
