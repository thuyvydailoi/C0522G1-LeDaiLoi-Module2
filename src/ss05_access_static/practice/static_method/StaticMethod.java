package ss05_access_static.practice.static_method;

public class StaticMethod {
    public static class Student {
        private  int rollno;
        public String name;
        private static String college = "BBDIT";

        //constructor to initialize the variavvle
        Student(int r, String n){
            rollno = r;
            name = n;
        }

        //static method to change the value of static variable
        static void change(){
            college = "CODEGYM";
        }

        //method to display values
        void display(){
            System.out.println(rollno+" " + name + " " + college);
        }
    }
}
