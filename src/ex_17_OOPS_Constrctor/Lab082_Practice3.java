package ex_17_OOPS_Constrctor;

public class Lab082_Practice3 {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        Baby b2 = new Baby();
        System.out.println(b1.name);
        System.out.println(b2.name);

        Baby b3 = new Baby ("lucky","1234567", 2022, 06, 23);
        System.out.println(b3.name);
        Baby b4 = new Baby ("amit", "12345678", 2024, 04, 212);
        System.out.println(b4.name);

    }
}

class Baby {
    String name;
    String aadhar_no;
    int year;
    int month;
    int date;

    //default constructor
    Baby() {
        name = "gugu";
        aadhar_no = "0000";
        year = 1971;
        month = 12;
        date = 1;
    }
    //parameterizes constructor -allow you to give your input while creating objects. it will not call the default constructor.
    Baby (String name_user, String aadhar_no_user, int year_user, int month_user, int date_user){
        this.name = name_user;           //when you have to access value use this. within class
        this.aadhar_no = aadhar_no_user;
        this.year = year_user;
        this.month = month_user;
        this.date = date_user;


    }
}