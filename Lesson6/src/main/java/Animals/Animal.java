package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public abstract class Animal {
  protected String name;
  public static int cntAnimal;

  Animal() {
    cntAnimal++;
  }

  public abstract void run(int l);
  public abstract void swim(int l);
}
