package nl.ekholabs.fp;

import java.util.function.BiFunction;

import static java.lang.System.out;

public class MyBiFunction {

  public static void main(String[] args) {
    final MyBiFunction myFunction = new MyBiFunction();
    myFunction.biFunctionExample1();

    myFunction.biFunctionExercise1();
  }

  public void biFunctionExample1() {
    // Add two numbers using a BiFunction
    BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    out.println(add.apply(3, 2));
  }

  public void biFunctionExercise1() {
    // Given two strings concatenate them
    // TODO: Complete the BiFunction by replacing ???s
//    BiFunction<???> concat = ??? -> s1 + s2;
//    out.println(concat.apply("hello", " world!"));
  }

}
