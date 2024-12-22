package search;

public class kandane {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        //for all the negative numbers in array it will always give 0 this is the corner case
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
           cs =  arr[i] + cs;
           if(cs < 0){
               cs = 0;
           }
           if(cs > ms){
               ms = cs;
           }
        }
        System.out.println(ms);
    }
}
