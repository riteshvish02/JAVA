package conditionals;
import java.util.Scanner;

public class switches {
    public static void main(String[] args) {


        int ch = 'A';

        System.out.println(ch++);
        int i = 11;

        i = i++ + ++i;

        System.out.println(i);
//        Scanner input  = new Scanner(System.in);
//        int num  =  input.nextInt();
//        switch (num){
//            case 15:
//                System.out.println("15");
//                break;
//            case 16:
//                System.out.println("16");
//                break;
//            case 17:
//                System.out.println("17");
//                break;
//            default:
//                System.out.println("invalid input");
//        }

        //check traingle
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first side of triangle ");
        int side1 = num.nextInt();
        System.out.print("Enter second side of triangle");
        int side2  = num.nextInt();
        System.out.print("Enter Third side of triangle");
        int side3 = num.nextInt();
       if(side1 + side2 > side3 && side2 +  side3 > side1 && side1 +  side3 > side2){
           if(side1 == side2 && side2 == side3 ){
               System.out.println("Triangle is Equilateral");
           }else if(side1 == side2 || side2 == side3 || side1 == side3){
               System.out.println("triangle is isosceles");
           }else{
               System.out.println("traingle is scelene");
           }
       }else{
           System.out.println("not a valid traingle");
       }
    }
}
