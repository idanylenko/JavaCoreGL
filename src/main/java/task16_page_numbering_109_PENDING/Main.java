package task16_page_numbering_109_PENDING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int pages = 0;
        int one_digit_pages = 9;
        int two_digit_pages = 90;
        int three_digit_pages = 900;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n >= 1 && n <= 9) {
            pages = n;
        } else if (n >= 10 && n <= 190) {
            pages = one_digit_pages + (n - 9) / 2;
        }
        else if (n >= 191 && n <= 2889) {
            pages = one_digit_pages + two_digit_pages + (n - 9 - 180) / 3;
        } else if (n >= 2890 && n <= 26893) {
            pages = one_digit_pages + two_digit_pages + three_digit_pages + (n - 9 - 180 - 2700) / 4;
        }
        System.out.println(pages);
        //System.out.printf ("%.0f", pages);

    }
}
