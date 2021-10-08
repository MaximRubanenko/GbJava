package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public class Dog extends Animal {
  final int DISTANCE_RUN_LIMIT = 500;
  final int DISTANCE_SWIM_LIMIT = 10;
  private static int cntDog;

  public static int getCntDog() {
    return cntDog;
  }

  public Dog(String name) {
    super.setName(name);
    cntDog++;
  }

  @Override
  public void run(int l) {
    if (l >= 0 && l <= DISTANCE_RUN_LIMIT) {
      super.run(l);
    } else {
      System.out.println("Собаки столько не бегают!");
    }
  }

  @Override
  public void swim(int l) {
    if (l >= 0 && l <= DISTANCE_SWIM_LIMIT) {
      super.swim(l);
    } else {
      System.out.println("Собаки столько не плавают!");
    }

  }

}