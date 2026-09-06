package leetcode.array;

public class lc121 {
    public static int buysell(int[] nums){
        int maxp=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                }
                int profit= nums[i]-min;
                if(profit>maxp){
                    maxp=profit;
                }
            }
        return maxp;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int ans= buysell(nums);
        System.out.println(ans);
    }
}
