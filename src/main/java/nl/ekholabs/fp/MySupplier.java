package nl.ekholabs.fp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.lang.System.out;

public class MySupplier {

    public static void main(String[] args) {
        final MySupplier mySupplier = new MySupplier();
        mySupplier.example1();
        mySupplier.example2();
        mySupplier.example3();
        mySupplier.example4();

        mySupplier.exercise1();
    }

    // This function takes a supplier of something to print
    private static void printer(Supplier somethingToPrint) {
        out.println(somethingToPrint.get());
    }

    private void example1() {
        Supplier<Integer> giveOne = () -> 1;
        out.println("1 = " + giveOne.get());
    }

    private void example2() {
        printer(() -> 123);
    }

    private void example3() {
        Stream.of("Chris", "Deepthi", "Alex")
                .forEach(name -> printer(() -> name));
    }

    private void example4() {
        Supplier<Integer> randomNumberBetweenOneAndTen = () -> ThreadLocalRandom.current().nextInt(1, 10);
        // print random number between one and ten
        printer(randomNumberBetweenOneAndTen);
        // And again
        printer(randomNumberBetweenOneAndTen);
        printer(() -> "==========");
    }

    private void exercise1() {
        // TODO: Write a supplier to provide the String "What the Func?"
        Supplier<String> supply = () -> "What the Func?!";
        Consumer<Supplier<String>> consume = stringSupplier -> printer(stringSupplier);
        consume.accept(supply);
    }
}