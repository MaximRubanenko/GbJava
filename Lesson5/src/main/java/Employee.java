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
    fio = "unnown";
    position = "unnown";
    email = "unnown";
    tel = "unnown";
    salary = 0;
    personAge = 18;
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
