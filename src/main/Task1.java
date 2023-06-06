/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Ваше число: %d", InsertData());
    }
//Исключение деление на ноль
    public static int Divide (int a, int b){
        return a/b;
    }
//Исключение ввод данных не верного формата
    public static int InsertData (){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int num = in.nextInt();
        in.close();
        return num;
    }

//Исключение выход за рамки массива
    public static void ExtractNumber (int [] array){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс массива: ");
        int index = in.nextInt();
        System.out.println(array[index]);
    }

}
