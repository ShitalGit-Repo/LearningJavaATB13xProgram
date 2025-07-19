package ex_21_Abstract_Interface;

public class Lab002_Abstract_EX {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.ComputePay();
    }
    }
    class Company extends Employee{
        @Override
        double ComputePay(){
            return 1000;
        }
    }
abstract class Employee{
    private String name;
    private String address;
    private int phone_no;

    Employee(){
        System.out.println("Default Constructor");
    }
    Employee(String name, String address, int phone_no){
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }
    abstract double ComputePay();
     void maincheck(){
         System.out.println("Mailing a check to "+this.name + " "+this.address+" "+this.phone_no);
    }

}
