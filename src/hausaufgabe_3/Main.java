package hausaufgabe_3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1. Задаем целочисленный массив
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};

        System.out.print("Исходный массив ");

        System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + " ");
        //}
        System.out.println("");
        System.out.print("Массив после замены ");
        for (int i = 0; i < arr.length; i++) {
            // Замена элементов массива
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        ArrZerro();
        MulitiplizierenMitSechs();
        diag();
        //MinMax();
    }

    // Задание 2. Заполнение пустого массива
    public static void ArrZerro() {
        int[] arr1 = new int[8];
        System.out.print("Исходный пустой массив ");

        System.out.println(Arrays.toString(arr1));

        //for (int i = 0; i < arr1.length; i++) {
        //    System.out.print(arr1[i] + " ");
        //}

        System.out.println("");
        System.out.print("Исходный заполненный массив ");
        int arg = 0;
        for (int i = 1; i < arr1.length; i++) {
            arg += 3;
            arr1[i] = arr1[i] + arg;
        }

        System.out.println(Arrays.toString(arr1));

        //for (int i = 0; i < arr1.length; i++) {
        //    System.out.print(arr1[i] + " ");
        //}

    }

    // Задание 3. Умножить на 2 если меньше 6
    public static void MulitiplizierenMitSechs() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("");
        System.out.print("Новый массив ");
        System.out.println(Arrays.toString(arr2));

        //for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i] + " ");
        //   }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }

        System.out.println("");
        System.out.println(Arrays.toString(arr2));
        //    for (int i = 0; i < arr2.length; i++) {
        //          System.out.print(arr2[i] + " ");
        //       }

    }

    // Задание 4. Заполнить по диагонале 1
    public static void diag() {

        int[][] arr3 = new int[4][4];
        for ( int i = 0; i < arr3.length; i++) {

            for ( int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();
        }


        for ( int i = 0; i < arr3.length; i++) {

            for ( int j = 0; j < arr3.length; j++) {
                if(i==j){
                    arr3[i][j]=1;
                }
            }
            System.out.println();
        }

        for ( int i = 0; i < arr3.length; i++) {

            for ( int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();
        }
    }

    // Задание 5. Минимальное и максимальное число массива/ Потом сдам

   /* public static void MinMax(){
        System.out.println("Введите длинну массива");
        Scanner scanner = new Scanner(System.in);
        int LengthArr  = scanner.nextInt();
        int[] arr4 = new int[LengthArr];

        Random random = new Random();
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr4));

        int min, max;
        min = arr4[0];
        for (int i = 0; i < arr4.length; i++){

            if(arr4[i]>min){

            }
        }
    }*/

}
// Попробуем покомититься!!!!!!!!!!
// В обратную сторону
// еще раз
