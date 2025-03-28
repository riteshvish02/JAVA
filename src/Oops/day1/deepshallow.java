package Oops.day1;

public class deepshallow {
    public static void main(String[] args) {
        //shallow copy example
        Candidate c1 = new Candidate("Ritesh");
        c1.marks[0] = 11;
        c1.getData();
        Candidate c2 = new Candidate(c1);
        c2.marks[0] = 122;
        c2.getData();
        c1.getData();
    }
}
class Candidate{
    String name;
    int[] marks;
    Candidate(String name){
        this.name = name;
        marks = new int[3];
    }
    Candidate(Candidate c1){
        this.name = c1.name;
        this.marks = c1.marks;
    }
    void getData(){
        System.out.println(this.name);
        for(int val:this.marks){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

