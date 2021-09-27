/**
 * Rubanenko Maxim
 * 15.09.2021
 */
public class Lesson2 {
  public static void main(String[] args) {
    System.out.println(checkSumRange(3, 5));
    System.out.println(checkSumRange(10, 9));

    posOrNeg(-1);
    posOrNeg(0);
    posOrNeg(1);

    System.out.println(posOrNegB(-1));
    System.out.println(posOrNegB(0));
    System.out.println(posOrNegB(1));

    strRep(3, "Start");
    strRep(2, "Stop");

    int[] y = {40,100,200,400, 2007, 2008};
    for (int i : y) {
      if (checkYear(i)) {
        System.out.println(i + " Високосный год.");
      } else {
        System.out.println(i + " Невисокосный год.");
      }
    }
  }

  public static boolean checkSumRange(int a, int b) {
    return ((a + b) >= 10) && ((a + b) <= 20);
  }

  public static void posOrNeg(int a) {
    if (a >= 0) {
      System.out.println("Число положительное.");
    } else {
      System.out.println("Число отрицательное.");
    }
  }

  public static boolean posOrNegB(int a) {
    return (a < 0);
  }

  public static void strRep(int n, String str) {
    for (int i = 0; i < n; i++) {
      System.out.println(str);
    }
  }

 /* public static boolean checkYear(int year) {
    // Только для годов нашей эры
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else return year % 4 == 0;
  }*/

  public static boolean checkYear(int year) {
    // Только для годов нашей эры
    return (year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0));
  }

}