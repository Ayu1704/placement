package numbersystem;

import java.util.*;

public class octal_to_deci {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int binary = sc.nextInt();
            int octal=0;
            int power=0;
            while(binary>0){
                int digit = binary %10;
                octal += digit * Math.pow(8,power);
                power++;
                binary/= 10;
            }
            System.out.println(octal);
        }
    }


