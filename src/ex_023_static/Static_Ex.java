package ex_023_static;

import java.util.zip.ZipEntry;

public class Static_Ex {
    public static void main(String[] args) {
        ATB atb = new ATB();
        System.out.println();
    }
}
class ATB {
    static {
        System.out.println("Static block-Will be called when class is loaded");
    }
    {
        System.out.println("IIB-Will be called when object is created");
    }
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    static String className = "AutomationClass";
    static String mentorName = "Promod";

    static void Doassignment() {
        System.out.println("Do assignment");
    }
    static void joinclass (){
        System.out.println("Join class");
    }
    static void submit(){
        System.out.println("Mode of assignment is different");
    }

}