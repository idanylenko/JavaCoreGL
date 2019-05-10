package task13_ring_924;

public class Main {
    public static void main(String[] args) {
        double ring_area = 50.2655;
        int r_big = 5;
        double r_small;

        r_small = Math.sqrt((Math.PI * r_big * r_big - ring_area) / Math.PI);
        System.out.printf ("%.0f", r_small);

    }
}
