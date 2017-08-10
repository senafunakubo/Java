package MultiThread;

/**
 * Created by senafunakubo on 2017-08-10.
 */


public class MultiThreading {

    public static void main(String[] args){
        A a = new A();
        a.start();

        B b = new B();
        b.start();
    }

    static class A extends Thread{
         public void show(){
             for(int i=0; i<5; i++){
                 System.out.println("Hi");
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }

         @Override
         public void run(){
             show();
         }
    }

    static class B extends Thread{
        public void show(){
            for(int i=0; i<5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void run(){
            show();
        }
    }
}
