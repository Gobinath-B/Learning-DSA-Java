public class Introcls {

    public static void main(String[] args) {

        Student prince = new Student(33,"prince",86.0f);

        System.out.println("Roll no"+ prince.rno);
        System.out.println("Name:"+prince.name);
        System.out.println("Marks:"+prince.marks);
        prince.greetings("prince");
    }
}

 class Student{
int rno;
String name;
float marks;
    Student (int rno,String name,float marks){

        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }
    void greetings(String name){
        this.name = name;
        System.out.println("Hello "+ this.name);
    }
}