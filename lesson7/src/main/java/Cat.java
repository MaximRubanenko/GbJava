/**
 * Rubanenko Maxim
 * 05.10.2021
 */
public class Cat {
  String name;
  int appetite;
  boolean fullness;

  public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  public void eat(Plate p) {
    if (p.decreaseFood(appetite)) {
      fullness = true;
    } else {
      fullness = false;
    }
  }

  public void info() {
    System.out.println("Сытость кота " + name + " " + fullness);
  }
}
