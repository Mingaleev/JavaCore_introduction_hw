package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    static final int SIZE = 6;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)){
                System.out.println("Вы победитель!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if(checkWin(DOT_O)){
                System.out.println("Комьютер победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }


    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Input cord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    static void aiTurn() {
        int x;
        int y;
        if (aiTurn1MoveToLose()) return;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    /**
     * Метод проверяющий на наличие потенциальной победы в 1 ход и в случае положжительного ответа делает ход
     * */
    static boolean aiTurn1MoveToLose() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (aiTurn1MoveToLoseCor(i,j)) return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяющий на потенциальную победу в 1 ход по заданным координатам в 4х направлениях
     * */
    static boolean aiTurn1MoveToLoseCor (int i, int j) {
            //Проверяем влезем ли в  диапазон по Y
            if (i <= SIZE - DOTS_TO_WIN ){
                if (aiTurn1MoveToLoseCor2(i,j,0,1)) return true;
            }
            //Проверяем влезем ли в  диапазон по X
            if (j <= SIZE - DOTS_TO_WIN) {
                if (aiTurn1MoveToLoseCor2(i,j,1,0)) return true;
            }
            //Проверяем влезем ли в  диапазон по диагонали вниз
            if (j <= SIZE - DOTS_TO_WIN && i <= SIZE - DOTS_TO_WIN) {
                if (aiTurn1MoveToLoseCor2(i,j,1,1)) return true;
            }
            //Проверяем влезем ли в  диапазон по диагонали вверх
            if (j <= SIZE - DOTS_TO_WIN && i >= DOTS_TO_WIN-1) {
                if (aiTurn1MoveToLoseCor2(i,j,1,-1)) return true;
            }
        return false;
    }

    /**
     * Метод проверяющий n-ое количество точек, если одинаковых n-1 то в пробел закрывает своим ходом
     * */
    static boolean aiTurn1MoveToLoseCor2 (int i, int j, int x, int y) {
        int xBuf = 0, yBuf = 0, move = 0;
        for (int k = 0; k < DOTS_TO_WIN; k++) {
            if (map[i+(k*y)][j+(k*x)] == DOT_X) move++;
            else {
                xBuf = j+(k*x);
                yBuf = i+(k*y);
            }
        }
        if (move == DOTS_TO_WIN - 1) {
            if (map[yBuf][xBuf] == DOT_EMPTY) {
                map[yBuf][xBuf] = DOT_O;
                return true;
            }
        }
        return false;
    }


    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Метод проверяющий на победу
     * */
    static boolean checkWin(char c) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (checkWinCor(c,i,j)) return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяющий на победу по заданным координатам в 4х направлениях
     * */
    static boolean checkWinCor(char c, int i, int j) {
        //проверяем естт ли нужный символ в данной точке
        if (map[i][j] == c) {
            //Проверяем влезем ли в  диапазон по Y
            if (i <= SIZE - DOTS_TO_WIN ){
                if (checkWinCor2(c,i,j,0,1)) return true;
            }
            //Проверяем влезем ли в  диапазон по X
            if (j <= SIZE - DOTS_TO_WIN) {
                if (checkWinCor2(c,i,j,1,0)) return true;
            }
            //Проверяем влезем ли в  диапазон по диагонали вниз
            if (j <= SIZE - DOTS_TO_WIN && i <= SIZE - DOTS_TO_WIN) {
                if (checkWinCor2(c,i,j,1,1)) return true;
            }
            //Проверяем влезем ли в  диапазон по диагонали вверх
            if (j <= SIZE - DOTS_TO_WIN && i >= DOTS_TO_WIN-1) {
                if (checkWinCor2(c,i,j,1,-1)) return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяющий присутствие n-ое количество знаков подряд
     * */
    static boolean checkWinCor2(char c, int i, int j,int x, int y) {
        for (int k = 0; k < DOTS_TO_WIN; k++) {
            if (map[i+(k*y)][j+(k*x)] != c) return false;
        }
        return true;
    }
}
