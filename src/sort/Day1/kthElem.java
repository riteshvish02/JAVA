package sort.Day1;

import java.util.Scanner;

public class kthElem {
    public static void main(String[] args) {
        int[] arr = {4,12,9,4,5,6};
        Scanner val = new Scanner(System.in);
        System.out.print("Enter kth elem :");
        int k = val.nextInt();
        Kthelem(arr,k);
//        for(int elem:arr){
//            System.out.println(elem);
//        }
        System.out.println(arr[arr.length-k]);
    }
    public static void Kthelem(int[] arr,int k){
        for(int i = 0; i < k; i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
