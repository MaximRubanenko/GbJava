/**
 * Rubanenko Maxim
 * 05.10.2021
 */
public class Cat {
  private String name;
  private int appetite;
  private boolean fullness;

  protected Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  protected void eat(Plate p) {
    if (p.decreaseFood(appetite)) {
      fullness = true;
    } else {
      fullness = false;
    }
  }

  protected void info() {
    System.out.println("Сытость кота " + name + " " + fullness);
  }
}