package task4_quarter_918;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int quarter = 0;

        if (Math.abs(x) <= 100 && Math.abs(y) <= 100) {

            if (x > 0 && x <= 100 && y > 0 && y <= 100) {
                quarter = 1;
            } else if (x < 0 && x >= -100 && y > 0 && y <= 100) {
                quarter = 2;
            } else if (x < 0 && x >= -100 && y < 0 && y >= -100) {
                quarter = 3;
            } else if (x > 0 && x <= 100 && y < 0 && y >= -100) {
                quarter = 4;
            }
            System.out.println(quarter);

        } else {
            System.out.println("Numbers should not exceed 100 by absolute value");
        }
    }
}
