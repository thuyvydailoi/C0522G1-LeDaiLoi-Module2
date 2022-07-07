package ss5_AccessStatic.exercise.Student;

public class Student {
    private  String name ="John";
    public String classes ="C02";

    Student(){

    }

    public void setName(String name){
        this.name=name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
