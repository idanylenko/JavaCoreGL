package task14_type_of_triangle_905;

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
        if (a == b && b == c) {
            System.out.println(1);
        } else if (a == b || a == c || b == c) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        }
        else {
            System.out.println("Not possible to create triangle with given sides length");
        }

    }
}
