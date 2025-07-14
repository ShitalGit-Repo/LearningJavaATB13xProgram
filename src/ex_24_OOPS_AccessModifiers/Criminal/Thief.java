package ex_24_OOPS_AccessModifiers.Criminal;

import ex_24_OOPS_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
       // thief.canIshoot();  //anyone can access this if it is public so it should be private
    }
}
