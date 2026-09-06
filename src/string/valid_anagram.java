package string;

import java.util.Arrays;

//listen
//silent
//Output: true
public class valid_anagram {
    public static void main(String[] args) {
        String s = "silent";
        String k = "listen";
        System.out.println(ana(s,k));
    }
    public static boolean ana(String s, String k){
        if(s.length()!=k.length()){
            return false;
        }
        char[] ar1 = s.toCharArray();
        char[] ar2 = k.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1,ar2);
    }
}
