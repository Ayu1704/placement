package stack;

import java.util.*;

public class STOCK_SPAN {
    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        System.out.println(Arrays.toString(stockSpan(price)));
        System.out.println(Arrays.toString(stock(price)));
    }
    // optimized - O(n)
    public static int[] stock(int[] prices){
        int n = prices.length;;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&prices[st.peek()]<=prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
    }

    //brute force -O(n^2)
    public static int[] stockSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {

            span[i] = 1;

            int j = i - 1;

            while (j >= 0 && price[j] <= price[i]) {
                span[i]++;
                j--;
            }
        }

        return span;
    }


}
