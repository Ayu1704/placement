package stack;

import java.util.Stack;

public class Valid_parenthesis {
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean ans = isvalid("([{})");
        System.out.println(ans);
    }
}
