package ARRAY;

//kadanes Algorithm

public class max_subarraysum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxsum(arr));
    }
    public static int maxsum(int[] arr){
        int sum=0;
        int maxs=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>maxs){
                maxs=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxs;
    }
}
