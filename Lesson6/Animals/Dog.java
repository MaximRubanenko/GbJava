package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public class Dog extends Animal {
  final int DISTANCE_RUN_LIMIT = 500;
  final int DISTANCE_SWIM_LIMIT = 10;
  public static int count;

  public Dog(String name) {
    super.name = name;
    count++;
  }

  @Override
  public void run(int l) {
    if (l < DISTANCE_RUN_LIMIT) {
      System.out.println(name + " пробежал " + l + " метров.");
    } else {
      System.out.println("Собаки столько не бегают!");
    }
  }

  @Override
  public void swim(int l) {
    if (l < DISTANCE_SWIM_LIMIT) {
      System.out.println(name + " проплыл " + l + "метров.");
    } else {
      System.out.println("Собаки столько не плавают!");
    }

  }

}
