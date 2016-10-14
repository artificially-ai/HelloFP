package nl.ekholabs.fp;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class MyBiPredicate {
  public static void main(String[] args) {
    final MyBiPredicate myBiPredicate = new MyBiPredicate();
    myBiPredicate.example1();

    myBiPredicate.exercise1();
  }

  private void example1() {
    // Using two inputs return boolean
    BiPredicate<Integer, Integer> addedTogetherAreEven = (x, y) -> ((x + y) % 2) == 0;
    // Print the numbers between 1 and 10 that are even after adding one
    out.println(Arrays.toString(IntStream.range(1, 10).filter(i -> addedTogetherAreEven.test(i, 1)).toArray()));
  }

  private void exercise1() {
      BiPredicate<Integer, Integer> addedTogetherAreEven = (x, y) -> x % y == 0;
      out.println(Arrays.toString(IntStream.range(1, 10).filter(i -> addedTogetherAreEven.test(i, 1)).toArray()));
  }

//  private void exercise1() {
//
//
//
//    // TODO: Make BiPredicate that return if first number is multiple of second
////    BiPredicate<???> isDouble = ???;
////    out.println(isDouble.test(6,3) ? "True" : "False");
////    out.println(isDouble.test(3,6) ? "True" : "False");
//  }

}
