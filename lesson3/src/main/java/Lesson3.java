import java.util.Arrays;

/**
 * Rubanenko Maxim
 * 15.09.2021
 */
public class Lesson3 {

  public static void main(String[] args) {
    revArr();
    filArr();
    modArr();
    diagArr();
    initArr(3, 100);
    getMinElem();

  }

  private static void getMinElem() {
    int[] arr = {20, 17, 13, 9, 53, 22, 2, -1, -10, 24, 12000, -544};
    int minElem = arr[0];
    int maxElem = arr[0];
    for (int elem : arr) {
      if (elem < minElem) {
        minElem = elem;
      } else if (elem > maxElem) {
        maxElem = elem;
      }
    }
    System.out.println("Минимальный элемент: " + minElem);
    System.out.println("Максимальный элемент: " + maxElem);
    System.out.println();
  }

  private static void initArr(int len, int initvalue) {
    int[] arr1 = new int[len];
    Arrays.fill(arr1, initvalue);

    System.out.println("len: " + len + " initValue: " + initvalue);
    System.out.println(Arrays.toString(arr1));
    System.out.println();
  }

  private static void diagArr() {
    int n = 10;
    int k = 10;
    int i;
    int j;

    int[][] arr2D = new int[n][k];
    for (i = 0; i < n; i++) {
      for (j = 0; j < k; j++) {
        if (i == j || j == k - 1 - i) {
          arr2D[i][j] = 1;
        }
        System.out.print(" " + arr2D[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  private static void modArr() {

    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("До   : " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 6) {
        arr[i] = arr[i] * 2;
      }
    }
    System.out.println("После: " + Arrays.toString(arr));
    System.out.println();
  }

  private static void filArr() {
    int[] ar = new int[100];
    for (int i = 0; i < ar.length; i++) {
      ar[i] = i + 1;
    }
    System.out.println(Arrays.toString(ar));
    System.out.println();
  }

  private static void revArr() {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    System.out.println("До   : " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        arr[i] = 1;
      } else {
        arr[i] = 0;
      }
    }
    System.out.println("После: " + Arrays.toString(arr));
    System.out.println();
  }
}
