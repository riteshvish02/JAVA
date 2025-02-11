package revision.recursion;

public class two {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        f(arr,0,"");
    }
    public static void f(int[] arr,int idx,String output){
        if(arr.length == idx){
            System.out.println(output);
            return;
        }
        f(arr,idx+1,output + arr[idx]);
        f(arr,idx+1,output);

    }
}

