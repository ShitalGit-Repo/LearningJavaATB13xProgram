package ex_18_OOPS_Inheritance_Single;

public class TestCase1 extends CommonToAll {

    void RunningTC1(){
        StartBrowser();                        //calling this from another class
        System.out.println("TC1 is running");
        CloseBrowser();
    }

}
