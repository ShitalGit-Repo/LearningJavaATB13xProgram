package ex_20_OOPS_Encapsulation;

public class Lab001_OOPS_Encapsulation {
    public static void main(String[] args) {

//1
        login login = new login("admin", "Pass@123");
        //you can check the password as below which should not be allowed.
        System.out.println(login.password);
        //Also you can change the password as well.
        login.password = "345";
        //so this is not an encapsulated class and your password is accessible outside the class.

//2
        //After creating encapsulated class it will not be accessible outside the class.
        encapsulatedlogin login1 = new encapsulatedlogin("admin", "pwd@123");
        //System.out.println(login1.password); -- will not be accessible
        //Now you are a admin and want to change the password then need to create behaviours(getter,setter).
        String pass = login1.getPassword();
        System.out.println(pass);
        //you can decide whether to allow or not to change the password
        // if you want to allow to get the password but can't reset then simple remove set password from setter.
        login1.setPassword("admin@123",false);
    }
}
//1
class login {
    public String username;
    public String password;

    public login (String username, String password){     //parameterized constructor
        this.password = password;
        this.username = username;
    }
}
//2
class encapsulatedlogin {                                //parameterized constructor
    private String username;
    private String password;

    public encapsulatedlogin(String user, String pwd) {
        this.password = pwd;
        this.username = user;
    }

    //Creating Getter & Setter for admin role to change password.
//these baby sitters will give the access to private variables.
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
//    public String setPassword() {    //now admin cannot change the password.
//        this.password = password;
//    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed, only admin can change the password.");
        }
    }
}

