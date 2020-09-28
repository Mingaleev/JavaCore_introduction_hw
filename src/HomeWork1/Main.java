package HomeWork1;

public class Main {
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte by = 127;
        short s = 234;
        int i = 152344;
        long l = 541651186L;
        float f = 56.6454f;
        double d = 7.6165454646546;
        char c = 'c';
        boolean b = true;
        String str = "Artur";

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println(homeWork3 ());

        //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println(homeWork4(5,10));

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        homeWork5(0);

        //6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
        // число отрицательное, и вернуть false если положительное.
        System.out.println(homeWork6(-10));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести
        //в консоль сообщение «Привет, указанное_имя!».
        homeWork7(str);

        //Написать метод, который определяет, является ли год високосным, и выводит сообщение в
        //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
        //високосный.
        homeWork8(2100);

    }

    public static float homeWork3 (){
        float a = 2.5f, b = 1.5f, c = 10.0f, d = 2.5f;
        return a * (b + (c / d));
    }

    public static boolean homeWork4 (int a, int b) {
        int sum = a+b;
        return sum >= 10 && sum <= 20;
    }

    public static void homeWork5 (int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean homeWork6 (int a) {
        return a < 0;
    }

    public static void homeWork7 (String a) {
        System.out.printf("Привет, %s\n",a);
    }

    public static void homeWork8 (int year){
        if (year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
