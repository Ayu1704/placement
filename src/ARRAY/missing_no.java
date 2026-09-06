package ARRAY;

public class missing_no {
    public static void main(String[] args) {
        int[] arr = {3,2,5,0, 1};
        System.out.println(miss(arr));
    }
    public static int miss(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }else{
                i++;
            }
        }
        for(int in=0;in<arr.length;in++){
            if(in!=arr[in]){
                return in;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
