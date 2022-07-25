package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(int code, String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String level, String position, double wage) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                super.toString() +
                '}';
    }
}
