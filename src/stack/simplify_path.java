package stack;

import java.util.Stack;

public class simplify_path {
    public static String simplify(String path){
        Stack<String> st = new Stack<>();
        String[] part=path.split("/");
        for(String parts:part){
            if(parts.equals("")||parts.equals(".")){
                continue;
            } else if (parts.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(parts);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String folder:st){
            sb.append("/");
            sb.append(folder);
            if(sb.length()==0){
                return "/";
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String path = "/home/pictures/../docs";
        System.out.println(simplify(path));
    }
}
