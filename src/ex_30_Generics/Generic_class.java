package ex_30_Generics;

public class Generic_class {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("shital"); //- it is not possible if we specifically mention int in class.
    }

}
class GenericClass <T> {
    private T data;

    public GenericClass (T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}