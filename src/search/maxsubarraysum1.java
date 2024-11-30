package search;

public class maxsubarraysum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int maxsum = 0;
        for(int i=0;i<=arr.length-1;i++){
            for (int j = i;j<=arr.length-1;j++){
                int sum = 0;
                for(int k = i;k <= arr.length-1;k++){
                    sum += arr[k];
                }
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
