package ex_27_Enum;

public enum Color {
    RED ("#FF0000"),
    GREEN ("#61FF33"),
    BLUE ("#0000FF"),
    YELLOW ("#FFFF00");

    private String hexCode;

    Color (String hexCode){
        this.hexCode = hexCode;
    }
    String getHexcode(){
        return this.hexCode;
    }
}
