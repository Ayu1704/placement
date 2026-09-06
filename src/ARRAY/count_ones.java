package ARRAY;
import java.util.*;
public class count_ones {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,1, 0, 1, 1};
        System.out.println(cou(arr));
    }
    public static int cou(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count ++;
                if(count>max){
                    max=count;
                }
            } else if (arr[i]==0) {
                count =0;

            }
        }
        return max;
    }

}
