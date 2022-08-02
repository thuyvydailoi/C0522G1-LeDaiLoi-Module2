package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getCode(), this.getName(), this.getDateOfBirth(),
                this.getGender(), this.getId(), this.getPhoneNumber(),
                this.getEmail(), this.getLevel(), this.getPosition(), this.getWage());
    }

    public Employee(String code, String name, String dateOfBirth,
                    String gender, String id, String phoneNumber, String email,
                    String level, String position, double wage) {
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

    public void setWage(double wage) {
        this.wage = wage;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", level: " + level +
                ", position: " + position +
                ", wage: " + wage;
    }
}
