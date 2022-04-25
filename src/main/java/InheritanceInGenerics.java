import java.util.ArrayList;
import java.util.List;

/**
 * See: https://stackoverflow.com/questions/2745265/
 */
public class InheritanceInGenerics {
  public static void main(String[] args) {
    int a = 10;
    Integer b = 20;

    /**
     * Below operation is allowed due to polymorphism & inheritance: subclass can assigned to superclass ~ child object can assign to parent
     * Primitive int & Object Integer can be assigned to Number as, Number is its super class
     */
    Number number = a;
    number = b;

    /**
     * Below operation is allowed due to polymorphism & inheritance: subclass can assigned to superclass ~ child object can assign to parent
     * Primitive int, Object Integer and Number object can be assigned to Object as, Object is its super class
     */
    Object object = a;
    object = b;
    object = number;

    /**
     * Subclass can assigned to superclass ~ child object can assign to parent -> THIS IS NOT TRUE FOR GENERICS
     * Integer can be assigned to Object type BUT list of Integer can't be assigned to list of Objects
     */
    List<Integer> listOfInteger = new ArrayList<>();
    // List<Object> listOfObjects = listOfInteger;      // ERROR: Required type:List<Object> Provided: List<Integer>
  }
}
