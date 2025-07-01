
//we can have an abstract class with all the methods as abstract
//but we have another way of doing this

//every method in interface is public asbtract so no need to mention this.
interface A{

    //every variable inside interface should be final and static
    //final means we have to initialize it also

    //int age; // this give error
    int age = 44;
    String area = "Mumbai";
    


    void show();
    void config();
}

//interface will tell the method but will not implement it.

//to implement an interface we use implements keyword
//one class can implement mulitple interfaces

class B implements A{
    //we have to define all the methods present in interface otherwise our class will by default become abstract class
    public void show(){

    }
    public void config(){

    }
}

public class twentyfive{
    public static void main(String a[]){
        A obj; //we can not this
        //obj = new A();  //this will give error becasue can not instantiate the type A

        //we can do this:-
        obj = new B();
        obj.show();
        obj.config();

    }
}


//interfaces can extend also
interface x{

}
interface y extends x{
    
}