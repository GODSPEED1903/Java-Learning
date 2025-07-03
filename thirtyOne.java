

//mutation and thread at same time. means two thread simultaneouly change value of one variable
//thread and mutation at same time is not a good idea
//thread safe-> only one thread will work with that variable at one time

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class thirtyOne{
    public static void main(String a[]) throws InterruptedException{
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };
        Runnable obj2 = ()->{
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start();
        t2.start();

        //join is a method whicha llow main thread to wait for other thread to join
        t1.join();
        t2.join(); //this throw exception so we have to add Interrupted exception

        //two threads working with same variable -> say count = 4 and t1 and t2 reach at same time get count and increase it by 1 at same time, means with 2 iterations we get +1
        //to fix this use synchronized keyword in increament() method, using this java will make sure that this method will only be called by only one thread



        System.out.println(c.count);
    }
}


//everytime we create a new thread, it goes into a new state
//new, runnable, running , waiting ,dead -> these are all the states we have

// new -> start() -> runnable -> run() -> running -> sleep() or wait() -> waiting state -> notify() -> runnable
//                            -> stop()->dead     -> stop() -> dead