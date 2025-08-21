package ex_31_MultiThreading;

public class TH_03 {
    public static void main(String[] args) {

        ThreadGroup threadgroup = new ThreadGroup("workers");
        workerTH_03 w1 = new workerTH_03(threadgroup, "w1");
        w1.start();
        workerTH_03 w2 = new workerTH_03(threadgroup, "w2");
        w2.start();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
//Thread by Class
class workerTH_03 extends Thread {

    workerTH_03(ThreadGroup threadgroup, String name){
        super(threadgroup, name);
    }
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
