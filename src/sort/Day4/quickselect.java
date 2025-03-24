package sort.Day4;

public class quickselect {
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,2,1,0};
        int k = 2;
        int index = arr.length-k;
//        System.out.println(quickSelect(arr,0,arr.length-1,k)); //for kth smallestelem
        System.out.println(quickSelect(arr,0,arr.length-1,index)); //for kth largestelem

    }
    public static int quickSelect(int[] arr,int l,int r,int k){
        if(l == r) return l;
        int piv = getRandompivot(arr,l,r);
        int m = partition(arr,l,r,piv);
        if(m == k) return arr[m];
        else if(m < k)
            return quickSelect(arr,l,m+1,k);
        else
            return quickSelect(arr,m-1,r,k);
    }
    public static int getRandompivot(int[] arr,int l,int r){
        return (int) (Math.random() * (r-l+1) + l);
    }
    public static int partition(int[] arr,int l,int r,int pi){
        int m = l;
        int pivot = arr[pi];
        swap(arr,pi,r);
        for(int i = l;i < r;i++){
            if(arr[i] < pivot){
                swap(arr,m,i);
                m++;
            }
        }
        swap(arr,m,r);
        return m;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
