package string;

import java.util.HashMap;

public class char_frq {
    public static void main(String[] args) {
        String s = "banana";
        freq(s);
    }
    public static void freq(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(HashMap.Entry<Character,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + "->"+ entry.getValue());
        }
    }
}
