package numbersystem;

import java.util.*;
public class binary_to_deci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal=0;
        int power=0;
        while(binary>0){
            int digit = binary %10;
            decimal += digit * Math.pow(2,power);
            power++;
            binary/= 10;
        }
        System.out.println(decimal);
    }
}
