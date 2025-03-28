package Oops.day1;

public class copycons {
    public static void main(String[] args) {
        Student s1 = new Student("ritesh",171);
        s1.getData();
        Student s2 = new Student(s1);
        s2.getData();
    }
}
class  Student{
    private String name;
    private int rollNo;
    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
    void getData(){
        System.out.println(this.name + " " + this.rollNo);
    }
}
