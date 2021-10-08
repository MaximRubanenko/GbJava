package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public abstract class Animal {

  private String name;
  private static int cntAnimal;

  public static int getCntAnimal() {
    return cntAnimal;
  }

  public void setName(String name) {
    this.name = name;
  }

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