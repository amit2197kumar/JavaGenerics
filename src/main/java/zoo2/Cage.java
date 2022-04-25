package zoo2;

public class Cage<E extends Animals> {
  private E animal1;
  private E animal2;

  public Cage() {
  }

  public Cage(E animal1, E animal2) {
    this.animal1 = animal1;
    this.animal2 = animal2;
  }

  public E getAnimal1() {
    return animal1;
  }

  public void setAnimal1(E animal1) {
    this.animal1 = animal1;
  }

  public E getAnimal2() {
    return animal2;
  }

  public void setAnimal2(E animal2) {
    this.animal2 = animal2;
  }

  public boolean isCompatible() {
    return animal1.getType().equals(animal2.getType());
  }
}
