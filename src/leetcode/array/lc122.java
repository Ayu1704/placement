package leetcode.array;

public class lc122 {
    public static int buysell2(int[] nums){
        if(nums==null||nums.length<=1){
            return 0;
        }
        int maxprofit=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                int profit= nums[i]-nums[i-1];
                maxprofit += profit;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int ans= buysell2(nums);
        System.out.println(ans);
    }
}
