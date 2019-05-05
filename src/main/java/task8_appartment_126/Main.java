package task8_appartment_126;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int apartments;
        int entrances;
        int floors;
        int apartmentNumber;
        int apartmentFloor;
        int apartmentEntrance;

        Scanner in = new Scanner(System.in);
        apartments = in.nextInt();
        entrances = in.nextInt();
        floors = in.nextInt();
        apartmentNumber = in.nextInt();

        if (apartments <= 1000 && apartments >= apartmentNumber && apartmentNumber >= 1) {
            int apartmentInEntrance = apartments / entrances;
            int apartmentInFloor = apartmentInEntrance / floors;

            //1. Find out entrance    ---- Test data: 180 5 9 97, ER 3 7
            int intResEntrance = apartmentNumber / apartmentInEntrance;
            int remResEntrance = apartmentNumber % apartmentInEntrance;

            if (remResEntrance == 0) {
                apartmentEntrance = intResEntrance;
            } else {
                apartmentEntrance = intResEntrance + 1;
            }

            //2. Find out floor
            int intResFloor = remResEntrance / apartmentInFloor;
            int remResFloor = remResEntrance % apartmentInFloor;

            if (remResFloor == 0) {
                apartmentFloor = intResFloor;
            } else {
                apartmentFloor = intResFloor + 1;
            }

            System.out.println(apartmentEntrance + " " + apartmentFloor);
        } else {
            System.out.println("Input data is incorrect");
        }

    }
}
