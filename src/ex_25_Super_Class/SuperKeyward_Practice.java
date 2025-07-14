package ex_25_Super_Class;

public class SuperKeyward_Practice {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.Sound();
    }

}
class God {
    public int gold = 100;
    void Sound(){
        System.out.println("God-Sound");
    }
    God (){
        System.out.println("Default from God's class");
    }
}
class Animal extends God {
    @Override
    void Sound() {
        super.Sound();
    }
    Animal(){
        super();
    }
    Animal (int a, int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}
