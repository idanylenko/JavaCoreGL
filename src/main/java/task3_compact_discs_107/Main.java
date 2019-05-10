package task3_compact_discs_107;

public class Main {
    public static void main(String[] args) {
            int n = 123;
            int packs_100 = 0;
            int packs_20 = 0;
            int one_disk = 0;
            double sum;

            if (n / 100 > 0) {
                packs_100 = n / 100;
            }
            if ((n - packs_100 * 100) > 20) {
                packs_20 = (n - packs_100 * 100) / 20;
            }
            if ((n - packs_100 * 100 - packs_20 * 20) > 0) {
                one_disk = n - packs_100 * 100 - packs_20 * 20;
            }
            sum = packs_100 * 100 + packs_20 * 30 + one_disk * 2;

            System.out.println(sum);

    }
}
