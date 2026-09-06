package ARRAY;
import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {4,2,9,1,7};
        System.out.println(seclar(arr));
    }
    public static int seclar(int[] arr){
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(lar<arr[i]){
                sec=lar;
                lar=arr[i];
            }else if(arr[i]>sec && arr[i] != lar){ // && arr[i] != lar because if there is duplicate value then our code will return same
                sec=arr[i];                         // lar and sec largest value if not use this AND condn.
            }
        }
        return sec;
    }
}
