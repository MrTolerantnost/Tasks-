import java.util.Scanner;

/*Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
 Факториал числа это произведение всех чисел от этого числа до 1.
 Например 5!=5*4*3*2*1=120
 */
public class Task_3 {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        while (n<5 | n > 15 ){
        System.out.print("Input the numb number from 5 include to 15 include: ");
        n = in.nextInt();
        if (n<5 | n>15) {
            System.out.println(n + " is wrong numb! Try again");
        }

        }
        long rez = 1;

        for (int i = 1; i != n+1; i++ )
        {
            rez = rez*i;


        }

        System.out.println("!"+n+" = " + rez);

    }
}
