/*1. Есть девятиэтажный дом, в котором 4 подъезда.
Номер подъезда начинается с единицы. На одном этаже
4 квартиры. Напишите программу которая получит номер
квартиры с клавиатуры, и выведет на экран на каком этаже,
какого подъезда расположенна эта квартира. Если такои
̆ квартиры нет в этом доме то нужно сообщить об
этом пользователю.*/

import java.util.Scanner;

public class Task_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the flat number: ");
        int flatNum = in.nextInt();
        int floor = 0;
        int porch = 0;

        if (flatNum < 1 | flatNum > (9*4*4)) {
            System.out.println("There is no flat with " + flatNum + " number in the house");
        }else {



            while (porch != flatNum) {
                porch++;
            }
            int tempPorch = porch % (4 * 9);
            if (tempPorch == 0) {
                porch = (porch / (9 * 4));
            } else {
                porch = (porch / (9 * 4)) + 1;
            }



            while (floor != flatNum) {
                floor++;
            }
            int tempFloor = floor % 4;

            if (tempFloor == 0) {
                floor = (floor / 4);
            } else {
                floor = (floor / 4) + 1;
            }
            //int temp = floor/porch;
            if (floor > 9) {
                int temp = floor / 9;
                if ( floor%9 == 0 ){
                    floor = 9;}else{
                    System.out.println(temp);
                    floor = floor - (temp * 9);
                }
            }

            System.out.println("Porch = " +porch+ "\n" + "Floor = "+ floor + "\n" + "FlatNumber = "+ flatNum );
        }











    }
}




