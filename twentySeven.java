
//interface with 2 or more methods in normal interface
//functional/SAM(single abstract method) -> single method
//marker interface -> no methods

@FunctionalInterface
interface X{
    void show();
}

class Y implements X{
    public void show(){
        System.out.println("In Y show");
    }
}

//new java feature -> lembda expression




class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In B Show");
    }
}


public class twentySeven{
    public static void main(String a[]){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();  //here output=in A Show, we know we did something wrong here
        //to avoid this we can show the intention to compiler that i am trying to override the function here
        //for that we use annotation like @Override


        // X obj2 = new Y();

        X obj2 = () -> 
        {
            System.err.println("IN show");
        }; //this is called lembda expressioon bec. we and compiler both know that we can't create object of interface
        //we can create by defining the function in curly braces

        //this method(->) help us to save extra class file

    }
}

