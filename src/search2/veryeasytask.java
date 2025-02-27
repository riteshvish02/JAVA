package search2;

import java.util.Scanner;

public class veryeasytask {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x = inp.nextInt();
        int y = inp.nextInt();
        System.out.println(mintime(n,x,y));
    }
    public static int mintime(int n,int x,int y){
        int l = 0;
        int r = Math.max(x,y)*n;
        int ans = 0;
        while( l <= r){
            int mid = l + (r-l)/2;
            if(good(n,x,y,mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans + Math.min(x,y);
    }
    public static boolean good(int n,int x,int y,int mid){
        return (mid/x) + (mid/y) >= n-1;
    }
}
