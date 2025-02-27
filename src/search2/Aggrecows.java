package search2;

import java.util.Arrays;

public class Aggrecows {
    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9};
        int cows = 4;
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        int ans = 0;
        while(low <= high){
           int mid = low + (high - low)/2;
           if(canweplace(arr,mid,cows)){
               ans = mid;
               low = mid+1;
           }else{
               high = mid-1;
           }
        }
        System.out.println(ans);

    }

    public static boolean canweplace(int[] arr, int mid, int cows) {
        int count = 1; int lastcow = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i] - lastcow >= mid){
               lastcow = arr[i];
               count++;
            }
            if(count == cows) return true;
        }
        return false;
    }
}
