package stack;

import java.util.Stack;
import java.util.*;

public class daily_temperature {
    public static int[] temper(int[] temp){
        int n=temp.length;
        int[] ans=new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&temp[st.peek()]<temp[i]){
                int prev=st.pop();
                ans[prev]=i-prev;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp = {73,74,75,69,71,76,72,73,77};
        System.out.println(Arrays.toString(temper(temp)));
    }
}
