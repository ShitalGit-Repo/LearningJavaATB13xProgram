package ex_20_OOPS_Encapsulation;

public class Lav002_Encapsulation_EX {
    public static void main(String[] args) {

        ICICIBank shital = new ICICIBank("shital", 100);
        long balance = shital.getBalance();
        System.out.println(balance);
        shital.setBalance(500, true);
        long balance1 = shital.getBalance();
        System.out.println(balance1);

    }

    }

class ICICIBank {

    //STEP 1 - Make everything private so no one can access.
    private String name;
    private long balance;

    //STEP 2 - Create parameterized constructor.
    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    //STEP 3 - Create getter setter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed to change the balance");
        }
    }
}
