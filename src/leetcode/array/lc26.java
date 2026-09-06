package leetcode.array;

public class lc26 {
    public static int removeDuplicate(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2};
        int ans = removeDuplicate(nums);
        System.out.println(ans);
    }
}
