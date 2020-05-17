import java.util.Arrays;



/* Создать массив случайных чисел (размером 15 элементов).
    Создайте второй массив в два раза больше, первые 15
    элементов должны быть равны элементам первого массива,
    а остальные элементы заполнить удвоенных значением начальных.
    Например
    Было → {1,4,7,2}
    Стало → {1,4,7,2,2,8,14,4}*/
public class Task_6 {
    public static void main(String[] args) {
        byte quantity = 15;
        int i =0;
        int[] firstArray = new int[quantity];
        int[] secondArray = new int[quantity*2];
        for(int element:firstArray)
        {
            firstArray[i] = (int) (Math.random()*1000);
            i++;
        }
        System.out.println("Array: "+ Arrays.toString(firstArray));
        int p=0;
        int j=0;
        for(int element:firstArray)
        {

            secondArray[j] = firstArray[j];
            j++;
        }


        for(int element:firstArray)
        {

            secondArray[p+15] = firstArray[p]*2;
            p++;
        }
        System.out.println("Array: "+ Arrays.toString(secondArray));

    }


}
