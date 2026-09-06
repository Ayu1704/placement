package ARRAY;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        int[] arr = {4,2,9,1,7};
        System.out.println(lar(arr));
    }
    public static int lar(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
