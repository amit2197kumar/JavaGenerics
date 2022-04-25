import java.util.ArrayList;
import java.util.List;

/**
 * Generics were introduced to the Java language to provide tighter type checks at compile time and
 * to support generic programming.
 * See: https://www.w3schools.blog/generics-compile-time-checking-in-java
 */
public class GenericsIsAtCompilerLevel {
  public static void main(String[] args) {
    List<String> listOfStrings = new ArrayList<String>();
    listOfStrings.add("FIRST");
    listOfStrings.add("SECOND");

    addToList(listOfStrings, 100);
    System.out.println(listOfStrings);
  }

  /**
   * Despite being an String List we are able to add a integer.
   * Reason: Generics are bound to the variable, not the reference of the variable.
   * Generics checks happens just at compile time not at run time
   * The check happens at compile time just so that by mistake user don't make any mistake
   */
  private static void addToList(List listOfStrings, Integer var) {
    listOfStrings.add(var);
  }
}
