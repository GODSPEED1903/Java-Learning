//upcasting and downcasting in java


class A{
    public void show1(){
        System.err.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.err.println("In B show");
    }
}

public class twenty{
    public static void main(String aa[]){
        double d = 4.5;
        int i = (int) d;  //this is called typecasting
        System.out.println(i);

        // A obj = new A();
        // obj.show1(); //we can't call show2 because A don't have any idea of B

        // //A obj2 = new B(); //reference of A and object of B
        // A obj2 = (A) new B();  //upcasting because object is of B and refer is to A(we are going up to parent class)
        // obj2.show1();


        A obj = new B();
        obj.show1();

        //B obj1 = obj; //(this give error because obj is of type A)
        B obj1 = (B) obj;
        
    }
}