package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

            System.out.println("Checking a Number for Even/Odd");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number to check: ");
            int n = in.nextInt();
            if((n%2)==0){
                System.out.println("Number " + n + " is even \n");
            }
            else {
                System.out.println("Number " + n + " is odd \n");
            }

            System.out.println("Display the nearest to 10 of the two numbers");
            Scanner check = new Scanner(System.in);
            System.out.print("Enter a first number to check: ");
            float h = in.nextFloat();
            System.out.print("Enter a second number to check: ");
            float m = in.nextFloat();

            float h1 = h;
            h1 = h1 - 10;
            h1 = Math.abs(h1);
            float m1 = m;
            m1 = m1 - 10;
            m1 = Math.abs(m1);

            if (h1 < m1){
                System.out.println("The first number (" + h + ") is closer to 10 \n");
            }
            else if (h1 > m1) {
                System.out.println("The second number (" + m + ") is closer to 10 \n");
            }
            else if (h1 == m1) {
                System.out.println("The numbers are the same \n");
            }

            Random random = new Random();
            int RandomNumber = random.nextInt(900) + 100;
            System.out.println("Randomly generated number: " + RandomNumber);

            int max = 0;
            while (RandomNumber > 0) {
                if (RandomNumber % 10 > max) max = (int) (RandomNumber % 10);
                RandomNumber/=10;
            }
            System.out.println("The highest figure in this number: " + max);
    }
}
