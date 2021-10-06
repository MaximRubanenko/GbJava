/**
 * Rubanenko Maxim
 * 05.10.2021
 */
public class Plate {
  int food;

  public Plate(int food) {
    this.food = food;
  }

  public void info() {
    System.out.println("plate: " + food);
  }

  public boolean decreaseFood(int app) {
    if (food - app >= 0) {
      food -= app;
      return true;
    } else {
      return false;
    }

  }

  public void increaseFood(int eda) {
    food += eda;
  }
}
