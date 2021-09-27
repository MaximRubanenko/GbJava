/**
 * Rubanenko Maxim
 * 21.09.2021
 *
 */


import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
  public static int SIZE = 5;
  public static int DOTS_TO_WIN = 4;
  public static final char DOT_EMPTY = '•';
  public static final char DOT_X = 'X';
  public static final char DOT_O = 'O';
  public static char[][] map;
  public static Scanner sc = new Scanner(System.in);
  public static Random rand = new Random();
  public static int CurX;
  public static int CurY;

  public static void main(String[] args) {
    initMap();
    printMap();
    while (true) {
      humanTurn();
      printMap();
      if (checkWin(DOT_X)) {
        System.out.println("Победил человек");
        break;
      }
      if (isMapFull()) {
        System.out.println("Ничья");
        break;
      }
      aiTurn();
      printMap();
      if (checkWin(DOT_O)) {
        System.out.println("Победил Искуственный Интеллект");
        break;
      }
      if (isMapFull()) {
        System.out.println("Ничья");
        break;
      }
    }
    System.out.println("Игра закончена");
  }

  public static boolean checkWin(char symb) {
    if (chekLine(symb) || chekRow(symb) || checkDiag(symb)) return true;
    return false;
  }

  private static boolean checkDiag(char symb) {
    int cnt = 1;
    int i, j;
    for (i = CurX+1, j = CurY-1; (i < SIZE) && (j >=0) && (cnt <= DOTS_TO_WIN); i++, j--) { // вверх вправо
      if (map[i][j] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {
        break;
      }
    }
    for (i = CurX-1, j = CurY+1; (j < SIZE) && (i >= 0) && (cnt <= DOTS_TO_WIN); i--, j++) { //вниз влево
      if (map[i][j] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {
        break;
      }
    }
    cnt = 1; // сброс счетчика по диагонали
    for (i = CurX-1, j = CurY-1; (j >= 0) && (i >= 0) && (cnt <= DOTS_TO_WIN); i--, j--) { // вверх влево
      if (map[i][j] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {
        break;
      }
    }

    for (i = CurX+1, j = CurY+1; (j < SIZE) && (i < SIZE) && (cnt <= DOTS_TO_WIN); i++, j++) { // вниз вправо
      if (map[i][j] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {
        break;
      }
    }
    return false;
  }

  private static boolean chekLine(char symb) {
    int cnt = 0;
    for (int i = CurY; (i < SIZE) && (cnt <= DOTS_TO_WIN); i++) { //подчет от точки вправо
      if (map[CurX][i] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {break;}
    }


    for (int i = CurY - 1; (i >= 0) && (cnt <= DOTS_TO_WIN); i--) { //подчет от точки влево
      if (map[CurX][i] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
      }
    } else {break;}


    }
    return false;
  }

  private static boolean chekRow(char symb) {
    int cnt = 0;
    for (int i = CurX; (i < SIZE); i++) { //подчет от точки вверх
      if (map[i][CurY] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {break;}
    }



    for (int i = CurX - 1; (i >= 0); i--) { //подчет от точки вниз
      if (map[i][CurY] == symb) {
        cnt = cnt + 1;
        if (cnt == DOTS_TO_WIN) {
          return true;
        }
      } else {break;}
    }
    return false;
  }


  public static boolean isMapFull() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (map[i][j] == DOT_EMPTY) return false;
      }
    }
    return true;
  }

  public static void aiTurn() {
    //int x, y;
    CurX = 0;
    CurY = 0;
    do {
      CurX = rand.nextInt(SIZE);
      CurY = rand.nextInt(SIZE);
    } while (!isCellValid(CurX, CurY));
    System.out.println("Компьютер походил в точку " + (CurX + 1) + " " + (CurY + 1));
    map[CurX][CurY] = DOT_O;
  }

  public static void humanTurn() {
    //int x, y;
    CurX = 0;
    CurY = 0;
    do {
      System.out.println("Введите координаты в формате X Y");
      CurX = sc.nextInt() - 1;
      CurY = sc.nextInt() - 1;
    } while (!isCellValid(CurX, CurY)); // while(isCellValid(x, y) == false)
    map[CurX][CurY] = DOT_X;
  }

  public static boolean isCellValid(int x, int y) {
    if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
    if (map[x][y] == DOT_EMPTY) return true;
    return false;
  }

  public static void initMap() {
    map = new char[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        map[i][j] = DOT_EMPTY;
      }
    }
  }

  public static void printMap() {
    for (int i = 0; i <= SIZE; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < SIZE; i++) {
      System.out.print((i + 1) + " ");
      for (int j = 0; j < SIZE; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}

