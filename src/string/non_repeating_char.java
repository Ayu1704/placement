package string;

import java.util.HashMap;

//Input:  "aabbcddef"
//Output: c
public class non_repeating_char {
    public static char non_repe(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(Character c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mp.get(c)==1){
                return c;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        String s = "aabbccdeff";
        System.out.println(non_repe(s));
    }
}
