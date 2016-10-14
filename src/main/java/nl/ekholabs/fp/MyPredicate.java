package nl.ekholabs.fp;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class MyPredicate {
  public static void main(String[] args) {
    final MyPredicate myPredicate = new MyPredicate();
    myPredicate.example1();
  }

  private void example1() {
    Predicate<Integer> isEven = n -> (n % 2) == 0;
    // Check if our predicate is working
    out.println((isEven.test(2)) ? "2 is even" : "2 is odd");

    // Filter numbers between 1 and 5 that are even and get the sum of these numbers
    out.println("2 + 4 = " + IntStream.range(1, 5).filter(i -> isEven.test(i)).sum());

    // Print the list of even numbers between 1 and 10
    out.println(Arrays.toString(IntStream.range(1, 10).filter(i -> isEven.test(i)).toArray()));

    // Using two inputs return boolean
    BiPredicate<Integer, Integer> addedTogetherAreEven = (x, y) -> ((x + y) % 2) == 0;
    // Print the numbers between 1 and 10 that are even after adding one
    out.println(Arrays.toString(IntStream.range(1, 10).filter(i -> addedTogetherAreEven.test(i, 1)).toArray()));

    // andThen example
    Predicate<Integer> isGreaterThanFive = n -> n > 5;
    Predicate<Integer> isEvenAndGreaterThanFive = isEven.and(isGreaterThanFive);

    // Find numbers that are even and greater than 5 given numbers between 1 and 10
    // TODO:- Replace null with lambda expression to print the even numbers greater than 5 and less than 10
//    out.println(Arrays.toString(IntStream.range(1, 10).filter(null).toArray()));

  }

}
