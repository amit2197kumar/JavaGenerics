package zoo;

public class Zoo {
  public static void main(String[] args) {
    Cage<Monkey> monkeyCage = new Cage<>();
    monkeyCage.setAnimal1(new Monkey());
    monkeyCage.setAnimal2(new Monkey());

    // We see that below code is not giving any compile time error
    Cage<Monkey> monkeyCage2 = new Cage(new Monkey(), new Lion());

    // Below line is giving an error as in an <Monkey> type cake we are trying to put a Lion
    // Cage<Monkey> monkeyCage3 = new Cage<Monkey>(new Monkey(), new Lion());

    /**
     * Both LHS and RHS are evaluated differently
     * Line 10 is passes as RHS don't knew Cage was a generic type
     * Hence while using generics with constructor its important to pass the type in RHS as well
     */

    Cage<String> cageOfString = new Cage<>();
    /*
    Above we created a cage of strings, But that we don't want to happen
    We want to restrict so that cage of only valid animals can be created.
    See zoo 2 where we are making that restriction using wind card <?>
     */
  }
}
