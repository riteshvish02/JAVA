package search;

public class kadanes2 {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-5,-6};
        int currsum = arr[0];
        int maxsum = arr[0];
        for(int i =1;i < arr.length;i++){
            currsum = Math.max(currsum,currsum + arr[i]);
            maxsum = Math.max(currsum,maxsum);

        }
        System.out.println(maxsum);
    }
}
