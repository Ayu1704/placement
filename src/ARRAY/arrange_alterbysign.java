package ARRAY;

import java.util.Arrays;

public class arrange_alterbysign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(arran(arr)));
    }
    public static int[] arran(int[] arr){
        int[] result = new int[arr.length];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){
                result[pos] = arr[i];
                pos+=2;
            }
            else{
                result[neg] = arr[i];
                neg+=2;
            }
        }
        return result;
    }
}
