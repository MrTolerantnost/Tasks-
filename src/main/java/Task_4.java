/*Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем. */
public class Task_4 {

    public static void main(String[] args) {
        byte [] array ={0,5,2,4,7,1,3,19};
        int count = 0;
        for (int elem:array) {
            if (elem%2!=0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
