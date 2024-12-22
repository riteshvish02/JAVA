//package Recursion;
//
//public class question6 {
//    public  static  int count = 1;
//    public static int f(int sum,int coins[]){
//        if(sum == 0) return 0;
//        for(int i = 0;i <=3;i++){
//            if(sum >= coins[i])
//             1+f(sum-coins[i],coins);
//        }
//    }
//    public static void main(String[] args) {
//        int coins[] = {1,5,7};
//        System.out.println(f(11,coins));
//
//    }
//}
