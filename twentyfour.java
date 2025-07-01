
class A{
    public void show(){
        System.out.println("In A show");
    }
}


abstract  class B{
    public abstract void show();
}

public class twentyfour{
    public static void main(String a[]){
        A obj = new A();
        obj.show();
        //if we want to change the behaviour of show, we can create a class B extend it to A and do function overrride

        //if A class used only once when why to create a new class to override this function?

        //before semicolon we can define the implementation that how this should look like
        A obj2 = new A()
        {
            public void show(){
                System.out.println("In new SHow");
            }
        };
        //this implementation is an inner class with no name so this is called anonymous inner class
        obj2.show();


        //B obj3 = new B();//this give error because we can not initialize the abstract class
        B obj3 = new B(){
            public void show(){
                System.out.println("In new show");
            }
        };//we are not creating object of A. we are creating object of this annonymous class defined in curly braces
    }
}