package slidingwindow.constantwindow;

import java.util.Scanner;

public class basics{
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,6,5,8,1};
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the window size ");
        int k = inp.nextInt();
        int l  =0;
        int r = k-1;
        System.out.println(findMaxsum(l,r,arr));;
    }
    public static int findMaxsum(int l,int r,int[] arr){
        int sum = 0;
        int Maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = l;i <= r;i++){
            sum += arr[i];
        }
         Maxsum = Math.max(sum,Maxsum);
        while(r < n-1){
            sum -= arr[l];
            l++;
            r++;
            if(r<n){
                sum += arr[r];
            }
            Maxsum = Math.max(Maxsum,sum);
        }
        return Maxsum;
    }
}
