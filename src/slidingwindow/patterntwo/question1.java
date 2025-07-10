package slidingwindow.patterntwo;

public class question1 {
    //max points can be obtain from cards condition provided that you can pick from right  and left only
    public static void main(String[] args) {
      int[] arr = {4,4,1,5,5,6,3};
      int l = 0;
      int k = 3;
      int n = arr.length;
      int r = k-1;
      int back = n-1;
      int sum = 0;
      int maxPoint = 0;
      for(int i = 0;i < k;i++){
          sum += arr[i];
      }
      maxPoint = sum;
      for(int i = k-1;i >= 0; i--){
          sum -= arr[i];
          sum += arr[back];
          maxPoint = Math.max(maxPoint,sum);
          back--;
      }
        System.out.println(maxPoint);

    }

}
