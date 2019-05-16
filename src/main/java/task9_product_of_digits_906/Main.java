package task9_product_of_digits_906;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //235
        int number;
        int first;
        int second;
        int third;
        int product;

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        first = number / 100;
        second = (number - (first * 100)) / 10;
        third = number - first * 100 - second * 10;
        product = first * second * third;

        System.out.println(product);


    }
}
