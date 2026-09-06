package ARRAY;

public class secondsmallest {
    public static void main(String[] args) {
        int[] arr = {4,2,9,1,7};
        System.out.println(secsmall(arr));
    }
    public static int secsmall(int[] arr){
        int min=Integer.MAX_VALUE;
        int secmin= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                secmin=min;
                min=arr[i];
            } else if (arr[i]<secmin && arr[i]!=secmin){
                secmin=arr[i];
            }
        }
        return secmin;
    }
}
