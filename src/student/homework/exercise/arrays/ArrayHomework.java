package student.homework.exercise.arrays;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] weeklyTemps = { 0, 0, 0, 0, 0, 0, 0 };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of weekly temperatures from Monday to Sunday ");
        for (int i = 0; i < weeklyTemps.length; i++) {
            System.out.print("Enter the temperature in Celsius: ");
            weeklyTemps[i] = input.nextInt();
        }
        System.out.println("The temperatures on all 7 days are:");
        for (int i = 0; i < weeklyTemps.length; i++) {
            System.out.print(weeklyTemps[i] + ", ");
        }
        System.out.println();
        System.out.println("Temperature from Monday to Friday");
        for (int i = 0; i < 5; i++) {
            System.out.print(weeklyTemps[i] + ", ");
        }

        

    }
}
