package numbersystem;

import java.util.*;
public class deci_to_binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary= "";
        while(decimal>0){
            binary= (decimal%2) + binary;
            decimal /=2;

        }
        System.out.println(binary);
    }
}
