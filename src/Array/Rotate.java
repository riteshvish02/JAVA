package Array;
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        reverse(arr,k);
        display(arr);
    }
    public static void reverse(int[] a ,int k){
        k = k%a.length;
        if(k<0){
            k = k + a.length;
        }
        for(int i = 1;i<=k;i++){
            int temp = a[a.length - 1];
            for(int j=a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = temp;

        }
    }
    public static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
