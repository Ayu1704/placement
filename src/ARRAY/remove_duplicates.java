package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(rem(arr)));
    }
    public static int[] rem(int[] arr){
        int in=0;

        for(int i=1;i<arr.length;i++){
            if(arr[in]!=arr[i]){
                in++;
                arr[in]=arr[i];
            }
        }
        int[] result = new int[in+1];
        for(int i =0;i<=in;i++){
            result[i]=arr[i];
        }
        return result;

    }
}
