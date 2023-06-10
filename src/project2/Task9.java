package project2;


public class Task9 {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email) {
        this.email=email;
        if (this.email.contains("yahoo")) {
            System.out.println("Email set successful");
        }else {
            System.out.println("Email consider to be only Yahoo");
        }
    }
    void setUserName(String userName) {
        this.userName=userName;
        if (!this.userName.isEmpty() && this.userName.length()>6) {
            System.out.println("Username set successful");
        } else {
            System.out.println("Username has to be larger than six characters");
        }
    }

    public void setPassword(String password) {
        this.password=password;
        if (!this.password.isEmpty() && this.password.length()>6 && !password.contains(this.userName)) {
            System.out.println("Password created succesfully");
        } else {
            System.out.println("Password has to be larger than 6 characters and can't contain username");
        }
    }


}
class RegistrationTester{
    public static void main(String[] args) {
        Task9 user1 = new Task9();
        user1.setEmail("darko.kocovski.dk@gmail.com");
        user1.setUserName("ddarko123");
        user1.setPassword("thisisthepassword");
    }
}