package ex_31_MultiThreading;

public class TH_04 {
    public static void main(String[] args) {

        Runnable w1 = new workerTH_04();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new workerTH_04();
        Thread t2 = new Thread(w2);
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ "-"+ Thread.currentThread().getName());
        }
    }
}
class workerTH_04 implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}