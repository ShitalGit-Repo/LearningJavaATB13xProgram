package ex_29_Exception;

public class Exception_10_Custom {
    public static void main(String[] args) throws CurrencyMismatchCustomException {

        bank sbi = new bank("INR",100);
        bank icici = new bank("INR",123);
        int total = sbi.add(icici);
        System.out.println(total);

        bank jpchase = new bank("USD", 101);
        int new_total = sbi.add(jpchase);
        System.out.println(new_total);

    }
}
