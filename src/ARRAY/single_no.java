package ARRAY;


import java.sql.SQLOutput;
import java.util.*;
public class single_no {
    public static void main(String[] args) {
        int[] arr={4,3,3,4,5,1,2,1,2};
        System.out.println(sin(arr));
        System.out.println(sin1(arr));
    }
    //XOR logic it is optimized as a^0=a and a^a=0
    public static int sin1(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    //this is not optimized as sorting used soTC - O(NLOGN);
    public static int sin(int[] arr){
        Arrays.sort(arr);
        int i=1;
        while(i<arr.length){
            if(arr[i-1]==arr[i]){
                i=i+2;
            }else{
                return arr[i-1];
            }
        }
        return arr[arr.length-1];
    }
}
