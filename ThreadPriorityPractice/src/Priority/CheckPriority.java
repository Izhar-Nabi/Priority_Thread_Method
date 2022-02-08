package Priority;

public class CheckPriority implements Runnable {
    @Override
    public void run() {
        System.out.println("Child Thread");
      // System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Run Task Priority or Child Priority Set By JVM :"+Thread.currentThread().getPriority());
    }
    public static void main(String [] args){
        System.out.println("Main Method Thread Priority :"+Thread.currentThread().getPriority());
        CheckPriority check= new CheckPriority();
        Thread threadCreating= new Thread(check);
       Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
       //threadCreating.setDaemon(true); // here if we remove this (//) then Things will go BackGround.
        threadCreating.start();
    }
}
