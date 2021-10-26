/**
 * Rubanenko Maxim
 * 05.10.2021
 */
public class Plate {
  private int food;

  protected Plate(int food) {
    this.food = food;
  }

  protected void info() {
    System.out.println("plate: " + food);
  }

  protected boolean decreaseFood(int app) {
    if (food - app >= 0) {
      food -= app;
      return true;
    } else {
      return false;
    }

  }

  protected void increaseFood(int eda) {
    food += eda;
  }
}