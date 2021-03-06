package ss10_dsa.exercise.mvc_2.model;

public class Teacher extends Person {
    private String specialize;



    @Override
    public String toString() {
        return "Id:" + getId() + ", Tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Giới tính: " + getGender() + ", Chuyên môn: " + getSpecialize();
    }

    public Teacher() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n", this.getId(),this.getName(),this.getDateOfBirth(),this.getGender(),this.getSpecialize());
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
}
