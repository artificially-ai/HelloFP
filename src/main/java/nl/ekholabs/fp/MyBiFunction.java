package nl.ekholabs.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

import static java.lang.System.out;

public class MyBiFunction {

    public static void main(String[] args) {
        final MyBiFunction myFunction = new MyBiFunction();
        myFunction.biFunctionExample1();
        myFunction.biFunctionExercise1();
        myFunction.concatWithCurrying();
    }

    public void biFunctionExample1() {
        // Add two numbers using a BiFunction
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        out.println(add.apply(3, 2));
    }

    public void biFunctionExercise1() {
        // Given two strings concatenate them
        // TODO: Complete the BiFunction by replacing ???s
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        out.println(concat.apply("hello", " world!"));
    }

    public void concatWithCurrying() {
        String text1 = "Hello";
        String text2 = "World";

        Function<String, Function<String, String>> curry = s1 -> s2 -> String.join(", ", s1, s2);

        String s3 = curry.apply(text1).apply(text2);
        out.print(s3);
    }
}