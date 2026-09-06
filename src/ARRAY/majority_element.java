package ARRAY;

import java.util.HashMap;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(maj(arr));
        System.out.println(maj1(arr));
    }
    //Boyer–Moore Voting Algorithm
    //Rule----
    //If count == 0, choose the current number as candidate.
    //If current number equals candidate, increase count.
    //Otherwise, decrease count.
    public static int maj1(int[] arr){
        int count=0;
        int candidate=0;
        for(int num:arr){
            if(count==0){
                 candidate = num;
            }
            if(candidate==num){
                count++;

            }else{
                count--;
            }
        }
        return candidate;
    }


    // this is not optimal as it takes extra space
    public static int maj(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num:arr){
                mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(mp.get(num)>arr.length/2){
                return num;
            }
        }
        return 0;

    }

}
