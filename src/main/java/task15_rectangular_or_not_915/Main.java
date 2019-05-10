package task15_rectangular_or_not_915;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        if (sides[2] < sides[1] + sides[0]) {

            if (Math.pow(sides[2], 2) == (Math.pow(sides[0], 2) + Math.pow(sides[1], 2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Not possible to create a triangle with given sides length");
        }

    }
}
