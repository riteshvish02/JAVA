package search;

public class MaxsubPrefix {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i <= arr.length-1;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0;i <arr.length;i++){
            int currsum = 0;
            for(int j = 0;j <arr.length;j++){
               currsum =  i == 0 ?  prefix[j] : prefix[j] - prefix[i-1];
            }
            if(currsum > Maxsum){
                Maxsum = currsum;
            }
        }
        System.out.println(Maxsum);
    }
}
