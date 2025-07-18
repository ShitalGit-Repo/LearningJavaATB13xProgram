package ex_19_OOPS_Polymorphism;

public class Lab006_Override_Automation_EX {
    public static void main(String[] args) {

        chromeTC c1 = new chromeTC();
        c1.openbrowser();

        Firefox f1 = new Firefox();
        f1.openbrowser();

        CommonToAll CommonToAll = new CommonToAll();
        CommonToAll.openbrowser();

        //firefox  f1 = new chromeTC();  //not possible as as they have no relation.

        //Dynamic Dispatch
        CommonToAll c2 = new chromeTC();
        c2.openbrowser();

    }
}
class CommonToAll{
    void openbrowser(){
        System.out.println("Starting IE Browser");
    }
}
class chromeTC extends CommonToAll {
    @Override
    void openbrowser(){
        System.out.println("Starting chrome Browser");
    }
}
class Firefox extends CommonToAll {
    @Override
    void openbrowser(){
        System.out.println("Starting firefox Browser");
    }
}