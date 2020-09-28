package HomeWork2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
            // Задание 1.
            int[] arr = {0,0,1,0,1,0,0,1,1,0,1};

            for (int i = 0; i < arr.length; i++) {
                arr[i] = replacement(arr[i]);
            }
            System.out.println(Arrays.toString(arr));

            // Задание 2.
            int[] arr2 = new int[8];
            int k=0;
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = k;
                k+=3;
            }
            System.out.println(Arrays.toString(arr2));

            // Задание 3.
            int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    arr3[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(arr3));

            // Задание 4.
            int [] [] arr4 = new int [9][9];
            for (int i = 0; i < arr4.length; i++) {
                for (int q = 0; q < arr4[i].length; q++) {
                    arr4[i][q] = diagonal(i,q,arr4[i].length-1);
                    System.out.print(arr4[i][q]+" ");
                }
                System.out.println();
            }

            // Задание 5.
            int[] arr5 = {10,5,3,2,11,4,5,2,4,8,9,25};
            System.out.println(min(arr5));
            System.out.println(max(arr5));

            // Задание 6.
            int[] arr6 = {1,19,3,4,5,5,4,3,20};
            System.out.println(checkBalance(arr6));

            // Задание 7.
            int[] arr7 = {1,19,3,4,5,5,4,3,20};
            System.out.println(Arrays.toString(offset(arr7,-2)));

        }
        /**
         * Метод принимающий 1 или 0 и возвращающий противоположное число
         * */
        public static int replacement(int a){
            if (a == 0){
                return 1;
            } else {
                return 0;
            }
        }
        /**
         * Метод возвращающий 1 если это координаты диагонали
         * */
        public static int diagonal (int a, int b,int c){
            if (a == b || a+b==c){
                return 1;
            } else {
                return 0;
            }
        }
        /**
         * Метод возвращающий минимальное число из массива
         * @param arr переданный массив
         * */
        public static int min (int[] arr){
            int m = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (m > arr[i])  m = arr[i];
            }
            return m;
        }
        /**
         * Метод возвращающий максимальное число из массива
         * @param arr переданный массив
         * */
        public static int max (int[] arr){
            int m = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (m < arr[i]) m = arr[i];
            }
            return m;
        }
        /**
         * метод возвращает true, если в массиве есть место, в котором сумма левой и правой части массива равны
         * @param arr переданный массив
         * */
        public static boolean checkBalance (int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int sumLeft = 0, sumRight = 0;
                int j;
                //сумма левой части массива до элемента i включительно
                for (j = 0; j <= i; j++) {
                    sumLeft += arr[j];
                }
                //сумма оставшейся правой части массива
                for (int k = j; k < arr.length; k++) {
                    sumRight += arr[k];
                }
                if (sumLeft == sumRight) return true;
            }
            return false;
        }

        /**
         * Возвращает массив со смещением на n количество элементов
         * */
        public static int[] offset(int[] arr,int n){
            n %= arr.length;
            if (n != 0) {
                if (n > 0) {
                    offsetRight(arr,n);
                } else {
                    arr = offsetLeft(arr,n);
                }
            }
            return arr;
        }

        /**
         * Возвращает массив со смещением на n количество элементов вправо
         * */
        public static int[] offsetRight(int[] arr,int n){
            int buf;
            for (int i = 0; i < n; i++) {
                buf = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = buf;
            }
            return arr;
        }
        /**
         * Возвращает массив со смещением на n количество элементов влево
         * */
        public static int[] offsetLeft(int[] arr,int n){
            int buf;
            n = Math.abs(n);
            for (int i = 0; i < n; i++) {
                buf = arr[0];
                for (int j = 0; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = buf;
            }
            return arr;
        }
}
