package search;

public class ternarysearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int key = 60;
        System.out.println(ternarySearch(arr,key));;
    }
    public static int ternarySearch(int arr[], int key){
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;
            if(key== arr[mid1]) return mid1;
            if(key == arr[mid2]) return mid2;
            if(key < arr[mid1]){
                r = mid1 - 1;
            }else if(key > arr[mid2]){
                l = mid2 + 1;
            }else{
                l = mid1+1;
                r = mid2-1;
            }
        }
        return -1;
    }
}
