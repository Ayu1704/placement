package ARRAY;

public class buy_sell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bs(prices));
    }
    public static int bs(int[] prices){
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            int profit= prices[i]-minp;
            if(profit>maxp){
                maxp=profit;
            }
        }
        return maxp;

    }
}
