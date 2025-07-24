package ex_27_Enum;

public class Enum_subclass {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password  .getLocators());

        System.out.println(Color.RED.getHexcode());
        System.out.println(APIURL.VWO.getUrl());

    }
}
