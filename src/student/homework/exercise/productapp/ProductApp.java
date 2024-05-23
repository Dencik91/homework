package student.homework.exercise.productapp;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {

        Product[] order;

        Scanner input = new Scanner(System.in);
        System.out.println("How many types of items do you want to order?");
        int totalItems = input.nextInt();
        // alocate memory for the array
        order = new Product[totalItems];
        //read values from keyboard
        System.out.println("Please complete the order data");
        for (int i = 0; i < totalItems; i++) {
            System.out.println("Product " + (i+1) + ":");
            order[i] = new Product(
                    input.next(), input.nextFloat(), input.nextInt()
            );
        }
        // show values from array
        System.out.println("\nYour order:");
        for (Product product : order) {
            System.out.println(product);
        }
    }
}
