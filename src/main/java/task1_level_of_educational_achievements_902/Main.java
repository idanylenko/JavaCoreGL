package task1_level_of_educational_achievements_902;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int grade;
        String level = null;
        Scanner in = new Scanner(System.in);
        grade = in.nextInt();

        if (grade >= 1 && grade <= 12) {
            if (grade >= 1 && grade <= 3) {
                level = "Initial";
            } else if (grade >= 4 && grade <= 6) {
                level = "Average";
            } else if (grade >= 7 && grade <= 9) {
                level = "Sufficient";
            } else if (grade >= 10 && grade <= 12) {
                level = "High";
            } else {
                System.out.println("Grade is incorrect");
            }
            if (level != null) {
                System.out.println(level);
            }
        } else {
            System.out.println("Grade should be from 1 to 12");
        }
    }
}

