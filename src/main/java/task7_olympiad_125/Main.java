package task7_olympiad_125;

public class Main {
    public static void main(String[] args) {

        int h_0 = 9;
        int m_0 = 30;
        int s_0 = 0;
        int h_1 = 12;
        int m_1 = 45;
        int s_1 = 30;

        long seconds_duration = (h_1 - h_0) * 3600 + (m_1 - m_0) * 60 + (s_1 - s_0);

        long hours = seconds_duration / 3600;
        long minutes = (seconds_duration - (hours * 3600)) / 60;
        long seconds = seconds_duration - (hours * 3600) - (minutes * 60);
        System.out.println(hours + " " + minutes + " " + seconds);

    }
}
