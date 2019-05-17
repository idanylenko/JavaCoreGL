package task12_number_of_toys_927_PENDING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int countToysLess50 = 0;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[]quantity = new int[n];
//        double[]price = new double[n];

        while (in.hasNext()) {
            for (int i = 0; i < n*2; i++) {
                quantity[i] = in.nextInt();
                if(in.nextDouble()<50){
                    countToysLess50 += quantity[i];
                }
            }
        }



        System.out.println(n);



        System.out.println(countToysLess50);
    }
}
