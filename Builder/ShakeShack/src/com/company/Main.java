package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        String input;
        String[] parameter;
        ArrayList<String> orders = new ArrayList<>();

        Shake shake;
        ShakeShack shakeMaker = new ShakeShack();
        int totalPrice = 0 ;

        while (true) {
            choice = scanner.nextLine();

            if(choice.equals("O")) {
                System.out.println("PLACE YOUR ORDER: SHAKE-TYPE,MILK-TYPE,TOPPING-TYPE");
                while (true) {
                    input = scanner.nextLine();
                    if (input.equals("E")) {
                        if(orders.size() == 0) {
                            System.out.println("Please add something to your order");
                            continue;
                        }
                        break;
                    } else if (input.equals("O")) {
                        System.out.println("Would you like to add something to your order?");
                        input = scanner.nextLine();
                    }
                    orders.add(input);
                }

                for (int i = 0; i < orders.size(); i++) {
                    parameter = orders.get(i).split(",");
                    shakeMaker.produceShake(parameter);
                    shake = shakeMaker.getShake();
                    System.out.println("----------------------------------");
                    System.out.println("TOTAL PRICE" + "\t\t" + shake.getPrice() + "Tk");
                    totalPrice = totalPrice + shake.getPrice();
                    System.out.println();
                }
                System.out.println("----------------------------------");
                System.out.println("Order total:\t" + totalPrice);
            }
        }
    }
}
