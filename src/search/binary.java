package search;

public class binary {
    public static int binarySearch(int[] arr,int key){
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
               return  mid;
            }else if(arr[mid] < key){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,9,10};
        int key = 10;
        System.out.println( binarySearch(arr,key));
    }
}
