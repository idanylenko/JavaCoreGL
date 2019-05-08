package task10_quadratic_equasion_911;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double d;
        double x1;
        double x2;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a <= 100 && a >= -100 && b <= 100 && b >= -100 && c <= 100 && c >= -100) {
        d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No roots");
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("One root: " + x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two roots: " + x1 + " " + x2);
        }
         } else {
            System.out.println("The values of coefficients should not exceed 100 by absolute value");
        }
   }
}
