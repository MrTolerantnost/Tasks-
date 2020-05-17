import java.util.Scanner;

/*С помощью циклов нарисовать «обои».
Причем количество полос должно вводиться с клавиатуры.
В примере 7 полос.
 *+++*+++***+++***
 *+++*+++***+++***
 *+++*+++***+++***
 *+++*+++***+++***
 *+++*+++***+++***
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input number of stripes: ");
        int num = in.nextInt();

        for(int i=0; i<=5; i++){
            for(int j=0; j<num; j++){

                if(j%2 != 0){
                System.out.print("***");
                } else{
                    System.out.print("+++");
                }

            }

        System.out.println();

        }


    }
}
