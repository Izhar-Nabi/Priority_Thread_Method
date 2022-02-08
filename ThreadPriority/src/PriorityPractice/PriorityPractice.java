package PriorityPractice;

public class PriorityPractice implements Runnable{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("NOt A Daemon Thread");
        }
        System.out.println("This Will Show That How Thread Will Work ");
        System.out.println("Run form Priority is " + Thread.currentThread().getPriority());// here Thread Priority is 5, it is Default Value.
        // Changing The Priority of Run Task
        Thread.currentThread().setPriority(9);
        System.out.println("The New Thread Priority is " + Thread.currentThread().getPriority());
    }
    public static void main(String [] arg){
        PriorityPractice CreatingThread= new PriorityPractice();
        Thread ThreadHere= new Thread(CreatingThread);
        // here if you want to check that Thread is Daemon or not or make it daemon then you will provide here..
        // creating the Thread as Daemon
        ThreadHere.setDaemon(true);
        //Thread.currentThread().setDaemon(true);
        // if you want set the priority(max priority is 10) set here
        Thread.currentThread().setPriority(1);
        System.out.println("The Main Thread Priority is "+Thread.currentThread().getPriority());
        ThreadHere.start();
    }

}
