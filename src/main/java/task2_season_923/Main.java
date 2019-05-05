package task2_season_923;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int monthNumber = in.nextInt();
        String season = null;

        if (monthNumber >= 1 && monthNumber <= 12) {
        if (monthNumber >= 3 && monthNumber <= 5) {
            season = "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            season = "Summer";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            season = "Autumn";
        } else if (monthNumber == 12 || monthNumber <= 3) {
            season = "Winter";
        } else {
            System.out.println("Month number is incorrect");
        }
        if (season != null) {
            System.out.println(season);
        }
    } else {
            System.out.println("Month number should be from 1 to 12");
        }
        }
}
