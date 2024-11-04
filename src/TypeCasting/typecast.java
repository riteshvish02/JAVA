package TypeCasting;

public class typecast {
    public static void main(String[] args) {
        byte by = 10;
        short sh = 10;
        int in = 10;
        long ln = 10;
        double db = 15.7;
        float f = 14.2f;

//        implicit typeconversion

//        sh = by;
//        in = sh;
//        in = by;
//        ln = in;
//        ln = sh;
//        ln = by;

//also an example of implicit typeconversion

//        for(byte b = 1; b <=128; b++){
//            System.out.println("helloo sheryy " + b);
//        }
//

        //explicit typeconversion
//        in = (int) db;
//        System.out.println(in);
//        byte b = (byte) 130;
//        System.out.println(b);

        char ch = 'a';
        System.out.println(ch);
        in = ch;
        System.out.println(in);
        System.out.println((int) ch);


//        char chr = 70;
//        chr = (char) (chr + 1);
//        System.out.println(chr);

        char chr = 'a' + 1;
        chr = (char) ('a' + chr);
        System.out.println(chr);

        System.out.println(2 + ' ' + 5); //39
        System.out.println(2 + " " + 5);
        System.out.println( "hello" + '\t' + "world");
        System.out.println( "hello" + "\t" + "world");
        System.out.println( 2 + '\t' + 3);




    }
}
