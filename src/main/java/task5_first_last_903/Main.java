package task5_first_last_903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();

        if (inputNumber >= 100 && inputNumber <= 999) {
            int first = inputNumber / 100;
            int last = inputNumber % 10;

            if (first > last) {
                System.out.println(first);
            } else if (first == last) {
                System.out.println("=");
            } else {
                System.out.println(last);
            }
        } else {
            System.out.println("Please enter a three-digit number");
        }
    }
}

