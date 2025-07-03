package ex_05_TypeCasting_Widening_Narrowing;

public class Lab028_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;         //Widening - Implicit Casting.
        int a1 = (int) b;   //Widening - Explicit Casting. we mention it externally.
        //(int)b - int is in grey color it means JVM will take of it no need to mention externally.

        //Example 1 -->
        int val = 300;
        //byte b = val; -> Narrowing - Int to byte conversion. Not allowed
        byte b1 = (byte) val;  //Narrowing -> Explicit casting ->int to byte -> Expect data loss.

        System.out.println(b1);
        //Answer will be 44 and not 300 because 300 will be stored in memory in binary format.
        //and then it is converted from int to byte which is similar to from large to small container.
        //hence data loss is expected.
        //300 binary - 00000000000000000000000100101100 - int - 32 bits memory required.
        // byte - 00101100 - byte - 8 bits memory can be stored - remaining value can't be stored so
        // (0x2^7)+(0x2^6)+(1x2^5).. = 0+0+32+0+8+4+0+0 = 44

        //Example 2 -->
        long phone_no = 1234567891;
        //short s = phone_no;       //Implicit Narrow - Not Allowed.
        short s = (short) phone_no;  //Explicit Narrow - User needs to mention explicitly.

        System.out.println(s);
    }

}
