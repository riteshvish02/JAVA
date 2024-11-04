package functions;

public class funcBasic {
//    public static void main(String[] args) {
//        ritesh();
//        addNum(5,10);
//        addNum(10,10,45);
//    }
//    public static void ritesh(){
//        System.out.println("hello world ");
//    }
//    public static int addNum(int a, int b){
//        int sum = a+b;
//        System.out.println(sum);
//        return sum;
//    }
//    public static int addNum(int a, int b,int c){
//        int sum = a+b+c;
//        System.out.println(sum);
//        return sum;
//    }

    public static void main(String[] args) {
        System.out.println(func(5));
        System.out.println(func(22.555));
        System.out.println(func("5.6666"));

        int a = 10;
        int b = 30;
        System.out.println("before swap number a is " + a + " b is" +b);
        swap(a,b);
        System.out.println("after swap number a is " + a + " b is" +b);

    }
    public static String func(int a){
       return String.format("%d",a);
    }
    public static String func(double val){
        return String.format("%.2f",val);
    }
    public static String func(String val){
        return String.format("%.2f",Double.parseDouble(val));
    }

   public static void swap(int a ,int b){
       System.out.println(" before swap number  a is " + a + " b is " + b) ;
       int temp = a;
       a = b;
       b = temp;
       System.out.println("after swap number a is " + a + " b is " + b) ;
   }


}
