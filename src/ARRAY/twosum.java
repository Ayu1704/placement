package ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(summ(arr,target)));
        System.out.println(Arrays.toString(sum1(arr,target)));
    }
    // this is optimizes approch with TC - O(n) but takes extra space
    public static int[] sum1(int[] arr,int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed= target-arr[i];
            if(mp.containsKey(needed)){
                return new int[]{mp.get(needed),i};
            }
            mp.put(arr[i],i);
        }
        return new int[]{};
    }


    //this is not TC OPTIMIZED AS IT USES O(n^2)
    public static int[] summ(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};    }
}
