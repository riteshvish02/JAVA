package Array;

public class maxmin {
    public static void main(String[] args) {
        int[] arr = {1,-8,5,-3,8,9,0,-1};
        int min = minvalue(arr);
        System.out.println(min);

    }
    public static int minvalue(int[] arr){
        int val = arr[0];
        //or
        // int val = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length - 1;i++){
            if(arr[i+1]<val){
                val = arr[i+1];
//                return val;
            }
        }
        return val;
    }

}
