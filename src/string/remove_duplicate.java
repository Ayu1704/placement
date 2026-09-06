package string;
//Input:  "programming"
//output: "progamin"

import java.util.HashSet;

public class remove_duplicate {
    public static String remo(String s) {
        HashSet<Character> st = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!st.contains(c)){
            st.add(c);
            res.append(c);
        }}
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(remo(s));
    }
}
