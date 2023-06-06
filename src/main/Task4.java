/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
может увидеть - RuntimeException, т.е. ваше.*/

import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну 1го массива: ");
        int lenghtMass1 = in.nextInt();
        System.out.print("Введите длинну 2го массива: ");
        int lenghtMass2 = in.nextInt();
        in.close();
        int[] array1 = FillArray(lenghtMass1);
        int[] array2 = FillArray(lenghtMass2);
        int[] result = Divide(array1, array2);
        for (int val : result) {
            System.out.println(val);
        }
    }

    public static int[] Divide(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        int[] trouble = new int[0];
        try {
            for (int i = 0; i < array1.length; i++)
                result[i] = array1[i] / array2[i];
            return result;
        }catch (Exception e){
            System.out.printf("Введен не верный размер из массивов,\nдлинна 1го - %d\nдлинна 2го - %d\nМассивы" +
                    " должны быть одинаковой длинны\n", array1.length, array2.length);
            return trouble;
        }

    }

    public static int[] FillArray(int leght) {
        int[] result = new int[leght];
        for (int i = 0; i < leght; i++) {
            int data = (int) (Math.random() * 10);
            result[i] = data;
            }
        return result;
    }



}
