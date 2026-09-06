package numbersystem;

import java.util.*;
public class deci_to_octal {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int decimal = sc.nextInt();
            String octal="";
            while(decimal>0){
                octal= (decimal%8) + octal;
                decimal /=8;

            }
            System.out.println(octal);
        }


}
