package search;

public class kadanes2 {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currsum = arr[0];
        int maxsum = arr[0];
        for(int i =1;i < arr.length;i++){
            currsum = Math.max(arr[i],currsum + arr[i]);
            maxsum = Math.max(currsum,maxsum);

        }
        System.out.println(maxsum);
    }
}
