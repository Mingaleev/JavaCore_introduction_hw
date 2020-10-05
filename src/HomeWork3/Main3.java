package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random ();

    public static void main(String[] args) {
        //1 Задание
        game();

        //2 Задание
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        game2(words);
    }

    /**
     * Метод запускающий игру угадай слово
     * */
    public static void game2(String[] arr){
        int x = rand.nextInt (arr.length );//Генерируем случайно число из длинны массива
        String hiddenWord = arr[x];//Присваиваем загаданное число из массива
        System.out.println("Угадайте слово " + hiddenWord);
        String userAnswer = sc.nextLine();//Считываем ответ
        while (!hiddenWord.equals(userAnswer)) {
            check(hiddenWord, userAnswer);
            userAnswer = sc.nextLine();
        }
        System.out.println("Поздравляем, правильный ответ!");

    }
    /**
     * Метод обрабатывающий неправильный ответ подставляя угаданные символы
     * */
    public static void check (String a, String b) {
        int lenCompare = Math.min (a.length(), b.length());//Узнаем длину сравнения
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            if (i < lenCompare) {
                if (a.charAt(i) == b.charAt(i)) {
                    result.append(b.charAt(i));
                } else {
                    result.append("#");
                }
            } else  result.append("#");
        }
        System.out.println("Неправильно, попробуйте еще раз\n" + result);
    }

    /**
     * Метод запускающий раунд и при желании перезапускает его
     * */
    public static void game (){
        int replay = 1;
        while (replay > 0){
            raund();
            System.out.println("Повторить игру?\n1 - да  0 - нет");
            replay = sc.nextInt();
        }
    }

    /**
     * Метод раунда игры с 3мя попытками
     * */
    public static void raund(){
        int x = rand.nextInt ( 10 );
        int counterAttempt = 3;
        int userAnswer;
        do {
            System.out.println("Введите загаданное число от 0 до 9.\nОсталось попыток " + counterAttempt);
            userAnswer = sc.nextInt();
            counterAttempt --;
        } while (x != userAnswer && counterAttempt > 0);
        if (x==userAnswer){
            System.out.println("Правильно, вы выйграли!");
        } else {
            System.out.println("Вы проиграли");
        }
    }
}
