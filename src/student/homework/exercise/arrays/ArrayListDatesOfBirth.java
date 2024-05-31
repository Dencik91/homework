package student.homework.exercise.arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDatesOfBirth {
    public static void main(String[] args) {
        ArrayList<Integer> dates = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<10; i++) {
            dates.add(random.nextInt(1900, 2019));
        }
        System.out.println("Dates of birth of person younger than 50");
        for(int d: dates) {
            if ((2024 - d) < 50) {
                System.out.println(d);
            }
        }

        ArrayList<Integer> youngDates = new ArrayList<>();
        for (int d : dates) {
            if ((2024 - d) < 30) {
                youngDates.add(d);
            }
        }
        System.out.println("Dates of birth of person younger than 30");
        while (youngDates.size()>0) {
            System.out.println(youngDates.getFirst());
            youngDates.removeFirst();
        }
    }
}
