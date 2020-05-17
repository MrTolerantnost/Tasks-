import java.util.Arrays;
import java.util.Scanner;

/*Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b'
в этой строке, с выводом результат на экран.*/
public class Task_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input some text");
        String  str = in.nextLine();

        char b = 'b';
        int i = 0;
        int rez = 0;
        char[] array = str.toCharArray();

        for (char element:array)
        {

            if (array[i] == b)
            {
                rez++;
            }
            i++;
        }

        System.out.println("Quantity of \"b\" in \""+ str +"\" is: "+rez);
    }

}
