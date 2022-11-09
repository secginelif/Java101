import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //array list
        int[] array = {13, 5, 45, 13, 5, 45, 5, 45};
        int[] frequency = new int[array.length]; // frequency
        int over = -1; // times
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = over;
                }
            }
            if (frequency[i] != over)
                frequency[i] = count;
        }
        //printing repeating numbers
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("repeating numbers");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != over)
                System.out.println(array[i] + " number repeated " + frequency[i] + " times");
        }
    }

}
