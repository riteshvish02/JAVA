package revision.recursion;

public class mincoin {
    public static void main(String[] args) {
        int[] coins = {2, 3, 4, 5};
        System.out.println( f(21,coins));;
    }
    public static int f(int sum,int[] coins){
        if(sum == 0) return 0;
        if(sum < 0) return Integer.MAX_VALUE;
        int minCoin = Integer.MAX_VALUE;
        for(int coin = 0;coin <= coins.length-1;coin++){
              if(sum - coins[coin] >= 0){
                  int val = f(sum-coins[coin],coins);
                  if(val != Integer.MAX_VALUE){
                      minCoin = Math.min(minCoin,1+val);
                  }
              }
            }
         return minCoin;
        }
}
