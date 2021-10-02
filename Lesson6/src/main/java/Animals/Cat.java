package Animals;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public class Cat extends Animal {
  final int DISTANCE_RUN_LIMIT = 200;
  public static int cntCat;
  public Cat (String name){
    super.name = name;
    cntCat++;
  }

  @Override
  public void run(int l) {
    if (l >= 0  && l <= DISTANCE_RUN_LIMIT) {
      System.out.println(name + " пробежал " + l + " метров.");
    } else {
      System.out.println("Коты не могут бегать на " + l + " метров!");
    }
  }

  @Override
  public void swim(int l) {
    System.out.println("Кот не умеет плавать!");
  }


}
