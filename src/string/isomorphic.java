package string;

import java.util.HashMap;
import java.util.HashSet;

// i/p- add,egg o/p - true ex2 i/p- ab,cc o/p false
// //one char..maps to one char only in both direction
public class isomorphic {
    public static void main(String[] args) {
        String s="ab";
        String t="cc";
        System.out.println(iso(s,t));
    }
    public static boolean iso(String s , String t){
        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()) {
            if (mp.containsKey(s.charAt(i))) {
                if (mp.get(s.charAt(i)) != t.charAt(j)) { //mp.get gives value
                    return false;
                }}else{
                    if(st.contains(t.charAt(j))){
                        return false;
                    }


                mp.put(s.charAt(i), t.charAt(j)); //puts value
                st.add(t.charAt(j));
            }

                i++;
                j++;
        }
      return true;




    }
}
