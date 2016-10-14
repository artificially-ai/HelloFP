package nl.ekholabs.fp;

import java.util.function.BiConsumer;
import static java.lang.System.out;

public class MyBiConsumer {

  public static void main(String[] args) {
    final MyBiConsumer myConsumer = new MyBiConsumer();
    myConsumer.biConsumerExample1();
  }

  private static void printFullName(String firstname, String surname) {
    out.println(firstname + " " + surname);
  }

  private void biConsumerExample1() {
    out.println("Preparing consumer pipeline :- as two names are consumed action will be printFullName");
    BiConsumer<String, String> fullNames = MyBiConsumer::printFullName;
    fullNames.accept("Chris", "Hewison");
    fullNames.accept("Deepthi", "Variketi");
    fullNames.accept("Alex", "Rodiontsev");
  }

}
