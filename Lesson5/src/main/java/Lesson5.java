/**
 * Rubanenko Maxim
 * 24.09.2021
 */

public class Lesson5 {
  public static void main(String[] args) {

    Employee[] perArray = new Employee[5];
    perArray[0] = new Employee();
    perArray[1] = new Employee("Петров Иван", "Инженер", "test@mail.ru", "89851234567", 120000, 45);
    perArray[2] = new Employee("Сидоров Иван", "Инженер", "test@mail.ru", "89851234567", 120000, 44);
    perArray[3] = new Employee("Семенов Илья", "Тестер", "test@mail.ru", "89851234567", 100000, 32);
    perArray[4] = new Employee("Козлов Иван", "Менеджер", "test@mail.ru", "89851234567", 170000, 50);

    for (Employee pers : perArray) {
      if (pers.getPersonAge() > 40) {
        pers.info();
      }
    }

  }
}


