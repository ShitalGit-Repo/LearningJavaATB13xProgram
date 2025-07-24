package ex_27_Enum;

public class Enum {
//Enum - use when you just want to store the data which is constant
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(ProjectName.google);
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum ProjectName {
    google, restassured, katalon, vwo
}