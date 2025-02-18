package revision.recursion;

public class mincost {
    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(f(arr,0));;
    }
    public static int f(int[] arr,int idx){
        if(idx == arr.length-1) return 0;
        if(idx == arr.length-2) return Math.abs(arr[idx+1] - arr[idx]);
        return Math.min(
                 Math.abs(arr[idx+1] - arr[idx]) + f(arr,idx+1),
                 Math.abs(arr[idx+2]- arr[idx])+f(arr,idx+2)
               );
    }
}
