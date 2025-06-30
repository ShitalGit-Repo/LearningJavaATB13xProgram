package ex_01_Java_Basic_Variable;

public class Lab002_Variable {
    int x = 500;           //Global Variable
    static int y = 200;   //Static Global Variable

    public static void main(String[] args) {
        int Employee = 20;  //Employee is variable name and 20 is variable value
        System.out.println(Employee);

        String Name = "Shital"; //Local Variable

        //static int z=10;  //we cannot declare local variable as static
    }

    public void age() {
        String Surname = "Singh";  //Local Variable as declare in method
        System.out.println(Surname);
    }
}
