package zoo2;

public class Zoo {
  public static void main(String[] args) {
    Cage<Lion> cageOfLions = new Cage<>();
    cageOfLions.setAnimal1(new Lion());
    cageOfLions.setAnimal2(new Lion());

    /**
     * We can no longer do this as we are using wildcard with extension of Animals
     * We will get an error: Type parameter 'java.lang.String' is not within its bound; should extend 'com.example.demoproj.generics.zoo2.Animals'
     */
    //Cage<String> cageOfString = new Cage<>();
  }
}
