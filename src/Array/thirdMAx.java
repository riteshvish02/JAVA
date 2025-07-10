package Array;

public class thirdMAx {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; //for distinct elem
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for(int num:arr){
            if(
               ( first != null && first == num)
                || (second != null && second == num)
                || (third != null && third == num)
            ){
                continue;
            }
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }
            else if(second == null || num > second){
                third =  second;
                second = num;
            }
            else{
                third = num;
            }
        }
        System.out.println(third);
    }
}
