import Animals.Animal;
import Animals.Cat;
import Animals.Dog;

/**
 * Rubanenko Maxim
 * 01.10.2021
 */
public class AnimalsApp {
  public static void main(String[] args) {
    Animal[] animals = {
        new Cat("Барсик"),
        new Cat("Мурзик"),
        new Dog("Мухтар"),
        new Dog("Тузк"),
        new Dog("Пегас"),
    };

    for (Animal i : animals) {
      i.run(500);
      i.run(20);
      i.swim(500);
      i.swim(5);
    }
    System.out.println("Всего котов: " + Cat.cntCat);
    System.out.println("Всего собак: " + Dog.cntDog);
    System.out.println("Всего животных: " + Animal.cntAnimal);
  }
}
