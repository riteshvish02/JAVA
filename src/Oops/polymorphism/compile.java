package Oops.polymorphism;

public class compile {
    int a;
    compile(){
        System.out.println("compile");
    }
    compile(int val){
        this.a = val;
    }

    public static void main(String[] args) {
        compile c = new compile();
        compile c2 = new compile(5);
    }
}
