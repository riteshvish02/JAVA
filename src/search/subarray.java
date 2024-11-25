package search;

public class subarray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        for(int i = 0;i<arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                for(int k = i;k <= j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
