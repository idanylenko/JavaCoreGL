package task17_parallelogram_929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {
            if (a == b && c == d || a == c && b == d || a == d && b == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
