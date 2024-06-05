public class multi_threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Shubham")) ;
        Thread t2 = new Thread(new MyThread("Manish")) ;
        Thread t3 = new Thread(new MyThread("Vivek")) ;
        Thread t4 = new Thread(new MyThread("Amit")) ;

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

        static class MyThread implements Runnable{
           private String name;

           public MyThread(String name){
               this.name = name;
           }
           public void run(){
               for(int i=0;i<5;i++){
                   System.out.println(name + "working" + i);
                   try{
                       Thread.sleep(1000);
                   }catch(InterruptedException e){
                       e.printStackTrace();
                   }
               }
           }

        }
}
