package ARRAY;

import java.util.Arrays;

public class zero_toend {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(zero(arr)));
    }
    public static int[] zero(int[] arr){
        int in=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[in]=arr[i];
                in++;
            }
            }
        for(int i=in;i<arr.length;i++){
                arr[i]=0;
            }

        return arr;

    }
}
