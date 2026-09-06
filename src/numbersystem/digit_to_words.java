package numbersystem;
import java.util.*;
public class digit_to_words {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();

            String[] words = {
                    "Zero","One","Two","Three","Four",
                    "Five","Six","Seven","Eight","Nine"
            };

            for (int i = 0; i < num.length(); i++) {
                int digit = num.charAt(i) - '0'; // -0 becoz java ascii value pr kaam krta '0'= 48 ,'1'=49 and so on
                System.out.print(words[digit] + " ");
            }
        }
    }

