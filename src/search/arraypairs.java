package search;

public class arraypairs {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        for(int i = 0;i<=arr.length-1;i++){
            for(int j = i+1;j<=arr.length-1;j++){
                System.out.println(arr[i]+ "," +arr[j]);
            }
        }
    }
}
