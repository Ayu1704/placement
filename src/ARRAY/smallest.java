package ARRAY;

public class smallest {
    public static void main(String[] args) {
        int[] arr = {4,2,9,1,7};
        System.out.println(small(arr));
    }
    public static int small(int[] arr){
        int min=arr[0];
        for(int i =1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
