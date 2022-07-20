package ss10_dsa.exercise.mvc_2.model;

public class Student extends Person {
    private int point;
    private String nameClass;


    @Override
    public String toString() {
        return "Id:" + getId() + ", Tên: " + getName() + ", Lớp: " + getNameClass() +
                ", Điếm: " + point + ", Ngày sinh: " + getDateOfBirth() + ", Giới tính: " + getGender();
    }

    public int getPoint() {
        return point;
    }

    public Student() {
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Student(int id, String name, int point,
                   String dateOfBirth, String nameClass, String gender) {
        super(id, name, dateOfBirth, gender);
        this.point = point;
        this.nameClass = nameClass;

    }
}
