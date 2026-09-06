package string;
//i love india
//op - india love i
public class reverse_words {
    public static void main(String[] args) {
        String s = "i love india";
        System.out.println(rev(s));
    }
    public static String rev(String s){
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }


        }
            return sb.toString();
    }
    }

