/**
 * Rubanenko Maxim
 * 05.10.2021
 */
public class Lesson7 {
  public static void main(String[] args) {
    Cat[] cats = {
        new Cat("Barsik", 5),
        new Cat("Mursik", 3),
        new Cat("Vaska", 3),
        new Cat("Kotya", 2),
        new Cat("Timka", 1),
    };

    Plate p = new Plate(7);
    for (Cat c : cats) {
      c.eat(p);
      p.increaseFood((int) (Math.random() * 3));
    }

    for (Cat c : cats) {
      c.info();
    }
    p.info();
  }
}
