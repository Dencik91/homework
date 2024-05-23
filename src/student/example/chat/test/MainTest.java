package student.example.chat.test;

public class MainTest {
    public static void main(String[] args) {
        UserSignUpTest userSignUpTest = new UserSignUpTest();
        userSignUpTest.before();
//        for (int i = 0; i < userSignUpTest.getMAX_USERS(); i++) {
//            System.out.println(userSignUpTest.getUsers()[i]);
//        }
        userSignUpTest.test();
        userSignUpTest.negativeTest();

//        for (int i = 0; i < userSignUpTest.getMAX_USERS(); i++) {
//            System.out.println(userSignUpTest.getUsers()[i]);
//        }
        System.out.println("Fake users " + userSignUpTest.getUsers().length);
        System.out.println("SignUp users " + userSignUpTest.getAuthService().getUsers().length);
    }
}
