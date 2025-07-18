package ex_19_OOPS_Polymorphism;

public class Lab003_Overloading_UseEX {
    public static void main(String[] args) {
        browser b1 = new browser();
        b1.startBrowser();

    }
}

class browser {
    void startBrowser(){
        System.out.println("Starting a browser");
    }
    String startBrowser(String Browser){
        System.out.println("Starting Browser"+ Browser);
        return Browser;

    }

}
