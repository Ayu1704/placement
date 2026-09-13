package stack;

import java.util.Stack;

//LC-155
public class MINSTACK {
    Stack<Integer> st;
    Stack<Integer>  minst;
    public MINSTACK{
        st = new Stack<>();
        minst = new Stack<>();
    }
    public void push(int val){
        st.push(val);
        if(minst.isEmpty()||val<=minst){
            minst.push(val);
        }
    }
    public  void pop(){
        if(st.peek().equals(minst)){
            minst.pop();
        }
        st.pop();
    }
    public int top(){
        return  st.peek();
    }
    public int getmin(){
        return minst.peek();
    }

}
