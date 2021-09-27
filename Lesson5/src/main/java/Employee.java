/**
 * Rubanenko Maxim
 * 27.09.2021
 */
public class Employee {
  String fio;
  String position;
  String email;
  String tel;
  Integer salary;
  Integer personAge;

  Employee() {
    fio = "Иванов Иван Иванович";
    position = "Tester";
    email = "master@mai.ru";
    tel = "89851112233";
    salary = 150000;
    personAge = 42;
  }

  Employee(String fio, String position, String email, String tel, Integer salary, Integer personAge) {
    this.fio = fio;
    this.position = position;
    this.email = email;
    this.tel = tel;
    this.salary = salary;
    this.personAge = personAge;
  }

  protected void info() {
    System.out.println("ФИО: " + fio + " Должность: " +
        position + " Email: " + email +
        " Зарплата: " + salary + " Возраст: " + personAge
    );
  }

  public Integer getPersonAge() {
    return personAge;
  }

}
