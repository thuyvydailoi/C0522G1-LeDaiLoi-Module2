package ss18_string_regex.exercise.name_class;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] validName = new String[]{"C0318G"};
    public static final String[] invalidName = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for(String name : validName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name + " is valid: " + isvalid);
        }

        for (String name : invalidName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name + "is valid: " + isvalid);
        }
    }
}
