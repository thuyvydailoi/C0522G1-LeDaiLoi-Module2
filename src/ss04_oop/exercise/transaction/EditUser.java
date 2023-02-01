package ss04_oop.exercise.transaction;

public class EditUser {
    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.getUsername());
        user.setPassword("0123");
//        System.out.println(user.getPassword());
    }

}
