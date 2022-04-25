import java.util.ArrayList;
import java.util.List;

/**
 * See:
 * 1. https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html
 * 2. https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
 * 3. https://www.w3schools.blog/upper-bounded-wildcards-in-generics
 * 4. https://www.w3schools.blog/unbounded-wildcard-generics
 * 5. https://medium.com/javarevisited/how-to-choose-upper-lower-bounds-in-java-generics-52bfdcfd17c2
 */
public class WildcardUpperBound {
  public static void main(String[] args) {
    List<Integer> listOfInteger = new ArrayList<Integer>();
    listOfInteger.add(01);
    listOfInteger.add(02);

    List<String> listOfString = new ArrayList<String>();
    listOfString.add("One");
    listOfString.add("Two");

    List<Double> listOfDouble = new ArrayList<Double>();
    listOfDouble.add(01d);
    listOfDouble.add(02d);

    printAllType(listOfInteger);
    printAllType(listOfString);
    printAllType(listOfDouble);

    printAllTypeBounderWildcard(listOfInteger);
    // printAllTypeBounderWildcard(listOfString); // NOT ALLOWED
    printAllTypeBounderWildcard(listOfDouble);
  }

  /**
   * With wildcard <?> we are telling the compiler that it will be list of some datatype
   * And that datatype will be same for whole list.
   *
   * Wildcard <?> only allow us to read from the list, write operations are NOT ALLOWED
   */
  private static void printAllType(List<?> listOfSomething) {
    listOfSomething.forEach(System.out::println);

    /*
    listOfSomething.add(new Object());                 // NOT ALLOWED, can't do write operation
    listOfSomething.add(new Integer(03));              // NOT ALLOWED, can't do write operation
    listOfSomething.add(new String("THREE"));          // NOT ALLOWED, can't do write operation
     */
  }

  /**
   * As Inheritance & polymorphism principles don't works at Generics, so:
   * Integer can be assigned to Object type BUT list of Integer can't be assigned to list of Objects
   *
   * Hence we need to use extends with the wildcard <?> if we want to use polymorphism
   * With List<? extends Number> we can accept list of all subclasses/child classes of Number class
   */
  private static void printAllTypeBounderWildcard(List<? extends Number> listOfSomething) {
    listOfSomething.forEach(System.out::println);

    /*
    listOfSomething.add(new Object());                 // NOT ALLOWED, can't do write operation
    listOfSomething.add(new Integer(03));              // NOT ALLOWED, can't do write operation
    listOfSomething.add(new String("THREE"));          // NOT ALLOWED, can't do write operation
     */
  }

  /**
   * Note: In case of upper bound, new elements can’t be added in the collection.
   * Elements are read only in case of upper bound. This is because we are using wild card in which
   * type is unknown so we can’t guarantee that the newly added object have the correct type.
   */
}
