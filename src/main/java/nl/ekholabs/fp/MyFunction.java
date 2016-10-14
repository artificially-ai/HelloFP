package nl.ekholabs.fp;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.*;

public class MyFunction {

  public static void main(String[] args) {
    final MyFunction myFunction = new MyFunction();
    myFunction.example1();
    myFunction.example2();
    myFunction.example3();
    myFunction.example4();

    myFunction.exercise1();
  }

  private void example1() {
    // A function that takes an Integer and returns a String
    Function<Integer, String> show = i -> "I'm a String -> " + i.toString();
    out.println(show.apply(1));
  }

  private void example2() {
    // The same using method reference instead of lambda
    Function<Integer, String> showWithMethodReference = Object::toString;
    out.println(showWithMethodReference.apply(2));
  }

  private void example3() {
    // Capitalize strings
    out.println(Stream.of("hello", "fp")
            .map(String::toUpperCase)
            .collect(toList()));
    // Identity
    out.println(Stream.of("hello", "fp")
            .map(Function.identity())
            .collect(toList()));
  }

  private void example4() {
    // Using andThen: divide by three and then square
    Function<Integer, Double> third = i -> i.doubleValue() / 3;
    Function<Double, Double> square = i -> i * i;
    out.println(third.andThen(square).apply(6));
  }

  private void exercise1() {
    // Using compose: square and then divide by three
    Function<Double, Double> third = i -> i.doubleValue() / 3;
    Function<Double, Double> square = i -> i * i;
    out.println(third.compose(square).apply(6D));
  }
}
