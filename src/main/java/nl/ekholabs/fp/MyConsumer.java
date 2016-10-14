package nl.ekholabs.fp;

import java.util.function.Consumer;

import static java.lang.System.out;

public class MyConsumer {

  public static void main(String[] args) {
    final MyConsumer myConsumer = new MyConsumer();
    myConsumer.example1();
  }

  private static void printName(String name) {
    out.println(name);
  }

  private void example1() {
    out.println("Preparing consumer pipeline :- as names are consumed action will be printName");
    Consumer<String> names = MyConsumer::printName;

    // Now accept names and perform the above action
    names.accept("Chris");
    names.accept("Deepthi");
    names.accept("Alex");
  }


}
