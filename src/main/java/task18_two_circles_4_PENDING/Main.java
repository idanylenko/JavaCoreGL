package task18_two_circles_4_PENDING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Логика такая:
        1. Если центры окружностей совпадают
              - если Р1 != Р2 -> 0 точек пересечения
              - если Р1 == Р2 -> много точек пересечения (-1)
        2. Найдем расстояние между центрами ОО
            - если ОО == Р1 + Р2 -> 1 точка пересечения
            - если ОО < Р1 + Р2 -> 2 точки пересечения
            - если ОО > Р1 + Р2 -> 0 точек пересечения
         */
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int r1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int r2 = in.nextInt();
        int result = 0;

        double oo = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        if (x1 == x2 && y1 == y2) {
            if (r1 == r2) {
                result = -1;
            }
            if (r1 != r2) {
                result = 0;
            }
        } else if (oo == r1 + r2) {
            result = 1;
        } else if (oo < (r1 + r2)) {
            result = 2;
        } else if (oo > (r1 + r2)) {
            result = 0;
        }
        System.out.println(result);

    }

}
