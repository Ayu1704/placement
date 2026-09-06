package recursionn;
import java.util.*;

public class incr_decr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
// agar 1 hume ek hi baar print krna toh

// public static void print(int n){
//    if(n==0) return;
//    System.out.println(n);
//    print(n-1);
//    if(n!=1) {
//        System.out.println(n);
//    }
//}

