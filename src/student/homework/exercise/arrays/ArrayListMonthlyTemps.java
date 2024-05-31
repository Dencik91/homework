package student.homework.exercise.arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class ArrayListMonthlyTemps {
    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<>();
        int i = 0;
        Random random = new Random();

        while (i<31) {
            temps.add(((random.nextInt(501))-250)/10.0);
            i++;
        }

        System.out.println("     mo     tu     we     th     fi     sa     su   ");
        for (i=0; i<31; i++) {
            if ((i/7 == 0)&&(i%7 == 0)) {
                System.out.printf("1.  %s5", temps.get(i));
            } else if ((i/7 == 1)&&(i%7 == 0)) {
                System.out.printf("\n2.  %s5", temps.get(i));
            } else if ((i/7 == 2)&&(i%7 == 0)) {
                System.out.printf("\n3.  %s5", temps.get(i));
            } else if ((i/7 == 3)&&(i%7 == 0)) {
                System.out.printf("\n4.  %s5", temps.get(i));
            } else if ((i/7 == 4)&&(i%7 == 0)) {
                System.out.printf("\n5.  %s5", temps.get(i));
            } else {
                System.out.printf("  %s5", temps.get(i));
            }

            // 4. ???
        }


        Double max=0.0, min=0.0, avg=0.0, buffer=0.0;
        for (Double t : temps) {
            if (t > max) {max = t;}
            if (t < min) {min = t;}
            buffer +=t;
        }
        avg = buffer/31;
        System.out.println("\n\nMax month temperature: " + max + "C");
        System.out.println("Min month temperature: " + min + "C");
        System.out.println("Average month temperature: " + avg + "C");
    }
}
