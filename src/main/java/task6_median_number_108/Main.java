package task6_median_number_108;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int median = 0;

        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (Math.abs(n1) <= 1000 && Math.abs(n2) <= 1000 && Math.abs(n3) <= 1000) {


            if (n1 > n2) {

                if (n1 > n3) {

                    if (n2 > n3) {
                        median = n2;
                    } else if (n2 < n3) {
                        median = n3;

                    } else if (n1 < n3) {
                        median = n1;
                    }

                }
            } else if (n1 < n2) {
                if (n1 > n3) {
                    median = n1;
                } else if (n1 < n3) {

                    if (n2 < n3) {
                        median = n2;
                    } else if (n2 > n3) {
                        median = n3;
                    }

                }

            } else if (n1 == n2 || n1 == n3) {
                median = n1;
            } else if (n2 == n3) {
                median = n2;
            }
            System.out.println(median);

        } else {
            System.out.println("Numbers should not exceed 1000 by absolute value");
        }

    }
}
