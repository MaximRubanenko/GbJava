package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public class Cat extends Animal {
  final int DISTANCE_RUN_LIMIT = 200;
  private static int cntCat;

  public static int getCntCat() {
    return cntCat;
  }

  public Cat(String name) {
    super.setName(name);
    cntCat++;
  }

  @Override
  public void run(int l) {
    if (l >= 0 && l <= DISTANCE_RUN_LIMIT) {
      super.run(l);
    } else {
      System.out.println("Коты не могут бегать на " + l + " метров!");
    }
  }

  @Override
  public void swim(int l) {
    System.out.println("Кот не умеет плавать!");
  }


}
