package ss5_AccessStatic.practice.StaticMethod;

public class MainStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.change(); //calling change method

        //creating objects
        StaticMethod.Student s1 = new StaticMethod.Student(111, "Hoang");
        StaticMethod.Student s2= new StaticMethod.Student(222, "Khanh");
        StaticMethod.Student s3 = new StaticMethod.Student(333,"Nam");

        //calling display method

        s1.display();
        s2.display();
        s3.display();
    }
}
