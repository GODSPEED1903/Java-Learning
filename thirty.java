
//one particular task into subtasks. multitaking or dividing your task into small subtasks 
//in same taks we can have multiple threads.
//in a task -> smalles unit is thread and they can run parallely



//you can not execute normal objects in mulitple threads
//extends classs with thread to make this as thread

//we have to call start() methods to start a thread and this will call the run method, so in every thread you need to have run() method

// class A extends Thread{
//     // public void show(){
//     //     for(int i=0; i<10; i++){
//     //         System.out.println("hi ");
//     //     }
//     // }
//     public void run(){
//         for(int i=0; i<10; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }


class A implements Runnable{
    // public void show(){
    //     for(int i=0; i<10; i++){
    //         System.out.println("hi ");
    //     }
    // }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}


//now A class extends thread, now if we want it to extend to any other class also means make it as multiple inheritance-> which is not possible
//in java, then how can we make this?
//Thread is a class which implements runnable, and this runnable interface has method called run()
//so instead of extending it to a thread we can implement it to runnable interface
//now in runnable interface we do not have start method, so start() will not work and give error

//thread is a class with mulitple cnstructor and one of the constructor take runnable as object
class B implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class thirty{
    public static void main(String a[]){
        // A obj1 = new A();
        // B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        // //range of priority goes from 1-10, 10->highest priority

        // obj2.setPriority(Thread.MAX_PRIORITY);
        // //here we are suggesting to scheduler that give this high priority, it does not mean that scheduler will give him highest priority


        // obj1.start();  //start will execute the run methods
        // obj2.start();
        // //these will run parallely, behind the scene we have schedulers
        // //mulitcore cpu -> can execute mulitple thread at same time



        //we can create reference of interface and object of a class
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //for thread -> extends a thread class or implemnets a runnable interface
        //one this is runnable method will not have start() method so you have to create seperate thread object.
        
    }
}