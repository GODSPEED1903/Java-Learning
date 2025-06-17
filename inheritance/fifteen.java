
class A extends Object{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        //by default in every constructor first statement is super(), even though it is not visible
        //super(); -> means called the constructor of superclass(default one because we are passing not parameter here)

        System.out.println("In B");
    }
    public B(int n){
        super(n); // now parametrized constructor will be called
        System.out.println("In B int");
    }
}

public class fifteen{
    public static void main(String a[]){
        B obj = new B(); //this will exectute the constructor and B will be printed.
        //this will first print A and then B. 
        //it will call the contructor of subclass and superclass both.
        //if integer passed then B integer contrucotr iwll call but A's default contructor will be called
    }
}

//every class in java extends the "Object" class

//this(); -> it will execute the default constructor of given class