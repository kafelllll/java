package lab4;
import java.util.Arrays;

public class Main {

    public static void countingSort(int[] array, int max) {
        int n = array.length;
        int[] count = new int[max + 1]; 

        for (int num : array) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        int max = Arrays.stream(array).max().getAsInt(); 

        System.out.println("Array before sorting: " + Arrays.toString(array));
        countingSort(array, max);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
