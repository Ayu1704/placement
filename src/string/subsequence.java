package string;

public class subsequence {
    public static void main(String[] args) {
        //question 1
        String s = "abc";
        String t="ahcdgb";
        System.out.println(subseq(s,t));
        // question 2
    }
    public static boolean subseq(String s,String t){
        int i=0;
        for(int j=0;j<t.length()&&i<s.length();j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;

            }}

        if (i == s.length()) {
            return true;
        }
        return false;

    }
}
