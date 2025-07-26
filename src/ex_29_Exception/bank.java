package ex_29_Exception;

public class bank {
    private String currency;
    private Integer amount;

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(bank bankname) throws CurrencyMismatchCustomException {
        if (bankname.currency.equals("INR")) {
            return bankname.amount + this.amount;
        } else {
            throw new CurrencyMismatchCustomException("Currency Mismatch");
        }
    }
}
class CurrencyMismatchCustomException extends Exception {
        public CurrencyMismatchCustomException (String msg){
            super(msg);
        }
    }
