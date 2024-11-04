package TwodArray;

public class questions {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,8},
                {4,5,6,9},
                {7,8,9,7}
        };

        for(int i = 0;i < arr[0].length;i++){
            if(i%2 == 0){
                for(int j = 0;j<arr.length;j++){
                    System.out.print(arr[j][i]);
                }
                System.out.println();
                //down
            }else{
                for(int j = (arr.length-1);j>=0;j--){
                    System.out.print(arr[j][i]);
                }
                System.out.println();
                //up
            }
        }
    }
}
