package string;
//["flower", "flow", "flight"]
//Output: "fl"
public class prefix {
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        System.out.println(pre(words));
    }
    public static String pre(String[] words){
        String ans = "";
        for(int i = 0;i<words[0].length(); i++){
            char ch = words[0].charAt(i);
            for(int j=1;j<words.length;j++){
                if(i >= words[j].length()|| words[j].charAt(i)!=ch){
                    return ans;
                }
            }
            ans = ans + ch;
        }
        return ans;
    }

}
