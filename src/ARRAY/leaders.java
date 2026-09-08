package ARRAY;

import java.util.Arrays;

public class leaders {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println(Arrays.toString(lea(arr)));
    }

    public static int[] lea(int[] arr) {

        // Temporary array to store leaders
        int[] temp = new int[arr.length];

        int in = 0;

        // Last element is always a leader
        int max = arr[arr.length - 1];
        temp[in] = max;
        in++;

        // Traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                max = arr[i];
                temp[in] = arr[i];
                in++;
            }
        }

        // Create result array with exact size
        int[] result = new int[in];

        // Leaders are currently in reverse order
        for (int i = 0; i < in; i++) {
            result[i] = temp[in - 1 - i];
        }

        return result;
    }
}