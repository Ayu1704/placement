package stack;

import java.util.Stack;

public class POLISH_NOTATION {
    public static void main(String[] args) {
        String[] tokens = {"2","3","+","5","*"};
        System.out.println(evaRPN(tokens));
    }
    public static  int evaRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for(String token:tokens){
            if(token.equals("+")||token.equals("*")||token.equals("-")||token.equals("/")){
                    int b =st.pop();
                    int a= st.pop();

                int result=0;
                if(token.equals("+")){
                    result = a+b;
                } else if (token.equals("*")) {
                    result= a*b;

                } else if (token.equals("-")) {
                    result= a-b;

                }else{
                    result= a/b;
                }
                st.push(result);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

}
