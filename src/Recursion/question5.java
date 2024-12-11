package Recursion;

public class question5 {
    public static int f(int i,int n,int arr[]){

        if(i == arr.length-1) return 0;
        if(i == arr.length-2) return Math.abs( arr[i] - arr[i+1]);
        return  Math.min(Math.abs( arr[i] - arr[i+1])+f(i+1,n,arr),Math.abs( arr[i] - arr[i+2])+f(i+2,n,arr));

    }
    public static void main(String[] args) {
         int arr[] = {10,30,40,20};
        System.out.println(f(0,arr.length-1,arr));
    }
}
