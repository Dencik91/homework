package student.homework.exercise.arrays;

import java.util.ArrayList;

public class DevelopersHired {
    public static void main(String[] args) {
        ArrayList<String> devs = new ArrayList<>(); //String e tipul
        // de date declarat pentru arraylist cu numele devs
        // adding data to the list
        devs.add("Johny");
        devs.add("Valerya");
        devs.add("Tatyana");
        devs.add("Peter");
        devs.add("Marry");

        // showing the initials, use "charAt(index)" from "String" class
        for(String dev : devs) {
            System.out.println(dev.charAt(0) + ".");
        }

        // the longest name, use "length()" from "String" class
        int maxLength = 0;
        for(String dev : devs) {
            if (dev.length()>maxLength) maxLength = dev.length();
        }
        System.out.println("Max name length: " + maxLength);

        System.out.println("Names before swapping");
        devs.forEach(System.out::println);
        System.out.println("Names after swapping");
        // swap values
        String temp = devs.getFirst();
        devs.removeFirst();
        devs.addFirst(devs.getLast());
        devs.removeLast();
        devs.addLast(temp);
        devs.forEach(System.out::println);
    }
}
