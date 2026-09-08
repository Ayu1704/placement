package ARRAY;

import java.util.Arrays;
import java.util.HashSet;

public class longest_consecutive_subseq {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(lon(arr));
        System.out.println(lon1(arr));
    }

    // tc- O(n)
    //Step 1: Put all elements in HashSet → Step 2: Find sequence starts → Step 3: Count the sequence.
    public static int lon1(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        int max =0;
        for(int num:arr){
            if(!hs.contains(num-1)){
                int count =1;
                int current =num;

            while(hs.contains(current+1)){
                count++;
                current++;

            }
            max=Math.max(max,count);
            }

        }
        return max;

    }
    // not optimized as it uses sorting O(nlogn)
    public static int lon(int[] arr){
        Arrays.sort(arr);
        if(arr.length==0){
            return -1;
        }
        int count =1;
        int max=1;
        for(int i=1;i<arr.length;i++){
            if (arr[i] == arr[i-1]+1) {
                count++;
            }
            else if (arr[i] == arr[i - 1]) {
                // Duplicate → ignore it
                continue;
            }else { // reset count
                count =1;

            }
            max= Math.max(max,count);
        }
        return max;
    }
}
