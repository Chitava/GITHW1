/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
не равны, необходимо как-то оповестить пользователя.*/

import java.util.Map;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int length = LenghtMass();
        int[] array1 = FillArray(length);
        int[] array2 = FillArray(length);
        int[] result = SumMassiv(array1, array2);
        for (int val: result) {
            System.out.println(val);
        }
        }





    public static int[] SumMassiv (int[] array1, int[] array2){
        int [] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
            result[i] = array1[i]+array2[i];
        return result;
    }
    public static int LenghtMass(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну 1го массива: ");
        int lenghtMass1 = in.nextInt();
        System.out.print("Введите длинну 2го массива: ");
        int lenghtMass2 = in.nextInt();
        while (lenghtMass1 !=lenghtMass2) {
            System.out.print("Вы ввели разные размеры массивов, это недопустимо\n");
            System.out.print("Введите длинну 1го массива: ");
            lenghtMass1 = in.nextInt();
            System.out.print("Введите длинну 2го массива: ");
            lenghtMass2 = in.nextInt();
        }
        in.close();
        return lenghtMass1;
    }

    public static int[] FillArray (int x){
        int[] result = new int[x];
        for(int i = 0; i < x; i++){
            float rand = (float) (Math.random()*10);
            result[i] = (int)rand;
        }
        return result;
    }
}
