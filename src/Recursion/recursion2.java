package Recursion;

public class recursion2 {
//    public static int f(int n){
//        if(n==0 || n ==1) return n;
//        return f(n-1)+f(n-2);
//    }

//    public static void main(String[] args) {
//        //print nth fibonacci no.
//        int n = 5;
//        System.out.println(f(n));
//    }

//    public static void f(int arr[],int idx){
//        if(idx > arr.length-1) return;
//        System.out.println(arr[idx]);
//        f(arr,idx+1);
//
//    }
//    public static void main(String[] args) {
//        //print array recursively
//        int arr[] = {1,2,3,4};
//        int idx = 0;
//        f(arr,idx);
//    }

//    public static int f(int arr[],int idx){
//        if(idx == arr.length-1) return arr[idx];
//        return Math.max(arr[idx],f(arr,idx+1));
//    }
//    public static void main(String[] args) {
//        //find maximum in array
//        int arr[] = {4,55,1,23,1,7,9};
//        int idx = 0;
//        System.out.println(f(arr,idx));
//    }
    public static int f(int arr[],int idx,int x){
        if(idx >= arr.length) return -1;
        return (arr[idx] == x) ? idx : f(arr,idx+1,x);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,8,9,55,10};
        int x = 9;
        int idx = 0;
        System.out.println(f(arr,idx,x));
    }
}
