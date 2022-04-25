import java.util.ArrayList;
import java.util.List;

/**
 * See:
 * 1. https://www.w3schools.blog/lower-bounded-wildcards-in-generics
 * 2. https://stackoverflow.com/questions/13623189/
 * 3. https://medium.com/javarevisited/how-to-choose-upper-lower-bounds-in-java-generics-52bfdcfd17c2
 */
public class WildcardLowerBound {
  public static void main(String[] args) {
    List<Integer> listOfInteger = new ArrayList<Integer>();
    listOfInteger.add(01);
    listOfInteger.add(02);

    List<Double> listOfDouble = new ArrayList<Double>();
    listOfDouble.add(01d);
    listOfDouble.add(02d);

    printAllType(listOfInteger);
    printAllType(listOfDouble);

    /*
    addToList(listOfInteger, 99);     // NOT ALLOWED
    addToList(listOfDouble, 99);      // NOT ALLOWED
     */

    List<Number> listOfNumbers = new ArrayList<Number>();
    listOfNumbers.add(91);
    listOfNumbers.add(92d);
    addToList(listOfNumbers, 99l);
    System.out.println("listOfNumbers : " + listOfNumbers);

    List<Object> listOfObjects = new ArrayList<Object>();
    listOfObjects.add(91);
    listOfObjects.add(92d);
    addToList(listOfObjects, 99l);
    System.out.println("listOfObjects : " + listOfObjects);

  }

  /**
   * Here we use a unbounded wildcard <?>
   * Can only READ, Can't WRITE in case of unbounded wildcard <?>
   */
  private static void printAllType(List<?> listOfSomething) {
    listOfSomething.forEach(System.out::println);

    /*
    listOfSomething.add(new Object());          // NOT ALLOWED
    listOfSomething.add(new Integer(03));       // NOT ALLOWED
    listOfSomething.add(new String("THREE"));   // NOT ALLOWED
     */
  }

  /**
   * In case of Lower Bound wildcard we cab write, but can't READ.
   * Its somewhat opposite of upper bound wildcard
   */
  private static void addToList(List<? super Number> numbers, Number i) {
    numbers.add(i);

    /*
    Integer a = numbers.get(0); // NOT ALLOWED
    int b = numbers.get(0); // NOT ALLOWED
    Double c = numbers.get(0); // NOT ALLOWED
     */

    Object d = numbers.get(0);
  }
}

/**
 * PECS -> Producer Extends Consumer Super - In terms of Generics
 *
 * If generics is a producer, that means, if the generics is just for READ purpose then we need to use <? extends>
 * If generics is a consumer, that means, if the generics is just for WRITE purpose then we need to use <? super>
 */
