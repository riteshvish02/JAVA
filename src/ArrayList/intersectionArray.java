package ArrayList;

import java.util.ArrayList;

public class intersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {4,8,9,10,15,16,20,22};
        int[] arr2 = {8,9,10,11,12,13,14,15,16};
        System.out.println(Intersect(arr1,arr2));
    }
    public static ArrayList<Integer> Intersect(int a[], int b[]){
        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i< a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                result.add(a[i]);
                i++;
                j++;
            }

        }
        return  result;
    }

}
