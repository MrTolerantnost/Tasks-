/*Написать код для возможности создания массива целых чисел
(размер вводиться с клавиатуры) заполнените элементы произвольными числами.
 Выведите этот массив на экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input quantity elements of array: ");
        int quantity = in.nextInt();

        System.out.println(quantity);
        int i =0;
        int[] array = new int[quantity];

        for(int element:array)
        {
            System.out.println("Input "+(i+1)+" element of array: ");
            array[i] = in.nextInt();
            i++;

        }

        System.out.println("Array: "+Arrays.toString(array));

        //System.out.println(array);
    }
}
