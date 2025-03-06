package functions;

public class armStrongNumber {
    public static void main(String[] args) {
//        System.out.println("Start program");
//        System.out.println(isArmStrong(1634));
//        System.out.println("End program");
        System.out.println(reverse(1534236469));;
    }
    public static int reverse(int x) {
        int ans = 0;
        int n = x;
        Math.abs(n);
        System.out.println(n + "nn");
        while(n > 0){
            int rem = n%10;
            ans = ans * 10+rem;
            n /= 10;
        }
        if(x < 0){
            return ans*-1;
        }
        return ans;
    }
    public static Boolean isArmStrong(int n){
       int nod =  CountNum(n);
        System.out.println(nod);

       int sum = 0;
       int check = n;
       while(n > 0){
          int rem = n%10;
          n = n/10;
          sum += Math.pow(rem,nod);
       }
       if(check == sum){
           return true;
       }else{
           return false;
       }
    }
    public static int CountNum(int n){
        int nod = 0;
        while(n > 0){
            n = n/10;
            nod++;
        }
        return  nod;
    }


}
