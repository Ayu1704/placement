package numbersystem;

import java.util.*;

public class octal_to_binary {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String octal = sc.nextLine();

            int decimal = Integer.parseInt(octal, 8);
            String binary = Integer.toBinaryString(decimal);

            System.out.println(binary);
        }
    }

