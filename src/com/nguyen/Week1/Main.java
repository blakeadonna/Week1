package com.nguyen.Week1;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello World!");

        int dailyHighs[] = {50, 60, 70, 80, 90};
        String city = "Columbus";
        int age = 17;
        double gpa = 3.2;
        boolean isSnowing = true;

        System.out.println(dailyHighs[0]);
        System.out.println(age + " | " + gpa + " | " + isSnowing);
        System.out.println(city.toUpperCase());

        for (int i = 0; i <= 4; i++){
            System.out.println(dailyHighs[1]);
        }

        int twoDarray[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int i = 1;
        int result = ++i * 2;
        System.out.println(result);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println(name.toUpperCase());
    }
}
