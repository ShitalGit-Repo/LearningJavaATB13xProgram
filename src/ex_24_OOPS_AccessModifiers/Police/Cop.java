package ex_24_OOPS_AccessModifiers.Police;

public class Cop {
    public int gun;
    String icCard;

    public Cop (int bullet){
        this.gun = bullet;
    }
    protected void canIshoot (){
        System.out.println("Yes, you can!");
    }
    void thisDefault (){
        System.out.println("This is default");
    }
}
