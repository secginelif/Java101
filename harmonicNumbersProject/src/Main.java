import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {5, 7, 17, 16, 20, 55};
        //Harmonic mean => n(array length) / harmonic mean
        double sum = 0;
        for (double i : list) {
            sum += 1 / i;
        }
        double average = list.length / sum;
        System.out.println("Harmonic Mean: " + average);
    }


}
