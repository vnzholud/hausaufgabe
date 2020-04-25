package hausaufgabe_2;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {





        int counter = 1; // Счетчик попыток
        int ind = 0; // Индикатор хочу играть или нет


        System.out.println("Эта игра в угадывание чисел. Если хотите съиграть. Да -1, Нет - 0");
        System.out.println();

        ind = sc.nextInt();

        // Защита от дурака
        while (ind !=1&&ind!=0) {
            System.out.println("Ведите 0 или 1");
            ind = sc.nextInt();
        }

        while (ind == 1) {


            int x = random.nextInt(10); // генерация случайного числа


            System.out.println("Введите число от 0 до 9. У Вас три попытки.");
            for (int i = 0; i < 3; i++) {


                int InputDataUser = sc.nextInt();


                if (InputDataUser == x) {
                    System.out.println("Вы угадали");
                    break;
                } else if (counter == 3) {
                    System.out.println(" Вы проиграли.");
                    break;
                } else if (InputDataUser > x && counter != 3) {
                    System.out.println("Ваше число больше." + "У Вас осталось " + (2 - i) + " попытки. Введите число еще раз");
                    counter++;

                } else if (InputDataUser < x && counter != 3) {
                    System.out.println("Ваше число меньше." + "У Вас осталось " + (2 - i) + " попытки. Введите число еще раз");
                    counter++;
                }

            }


            System.out.println();
            System.out.println("Правильное число: " + x);
            System.out.println();
            System.out.println( "Хотите съиграть еще раз, то нажмите 1. Если нет 0");
            ind = sc.nextInt();

            // Защита от дурака

            while (ind !=1&&ind!=0) {
                System.out.println("Ведите 0 или 1");
                ind = sc.nextInt();
            }
            counter = 1; // Обнуляем счетчик

        }

    }

}
