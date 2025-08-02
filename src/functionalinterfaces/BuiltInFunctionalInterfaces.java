package functionalinterfaces;
import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        //Function<T,R> - takes input T and returns output R
        //R apply(T t)
        Function<String, Integer> func1 = s -> s.length();
        System.out.println(func1.apply("ArunKumar"));

        Function<Integer, Integer> func2 = Integer::bitCount;
        System.out.println(func2.apply(2));

        //Consumer<T> - takes input T and returns nothing
        //void accept(T t)
        Consumer<String> consumer1 = s -> System.out.println("Hello! " + s);
        consumer1.accept("Arun Kumar");

        Consumer<Integer> consumer2 = num -> System.out.println(num * 2);
        consumer2.accept(5);

        //Supplier<R> - takes nothing and returns R
        //R get()
        Supplier<String> supplier1 = () -> "Hello World!";
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = () -> 5;
        System.out.println(supplier2.get());

        //Predicate<T> - takes input T and returns boolean
        //boolean test(T t)
        Predicate<String> predicate1 = s -> s.length() > 5;
        System.out.println(predicate1.test("Arun"));

        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        System.out.println(predicate2.test(4));

        //BiFunction<T, U, R> - takes two inputs T, U and returns R
        //R apply(T t, U u)
        BiFunction<Integer, Integer, String> biFunc1 = (num1, num2) -> (num1 % 2 == 0 && num2 % 2 == 0) ? "Both nums are even" : "Both nums are not even";
        System.out.println(biFunc1.apply(4, 8));

        BiFunction<Integer, Integer, Integer> biFunc2 = Integer::sum;
        System.out.println(biFunc2.apply(1,2));

        //BiConsumer<T, U> - takes two inputs T, U and returns nothing
        //void accept(T t, U u)
        BiConsumer<String, Integer> biConsumer1 = (name, age) -> System.out.println(name + " is " + age + " years old");
        biConsumer1.accept("Arun", 28);

        BiConsumer<Integer, Integer> biConsumer2 = (num1, num2) -> System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        biConsumer2.accept(5, 8);

        //UnaryOperator<T> - takes one input of type T and returns output of same type
        //T apply(T t)
        UnaryOperator<Integer> unaryOperator1 = num -> num * num;
        System.out.println(unaryOperator1.apply(5));

        UnaryOperator<String> unaryOperator2 = s -> s + " - " + s.toUpperCase();
        System.out.println(unaryOperator2.apply("arunkumar"));

        //BinaryOperator<T,U> - takes two inputs of same type T and returns output of same type
        //T apply(T t1, T t2)
        BinaryOperator<Integer> binaryOperator1 = Integer::sum;
        System.out.println(binaryOperator1.apply(10, 20));

        BinaryOperator<String> binaryOperator2 = (s1, s2) -> s1 + "_" + s2;
        System.out.println(binaryOperator2.apply("Arun", "Kumar"));
    }
}
