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

  public void run(int l) {
    System.out.println(name + " пробежал " + l + " метров.");
  }

  public void swim(int l) {
    System.out.println(name + " проплыл " + l + " метров.");
  }
}
