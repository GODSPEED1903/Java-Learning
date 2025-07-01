class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

//we can stop the inheritance by making the class as final
final class calc{
    public void show(){
        System.out.println("In a show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
// class advCalc extends calc{

// }   this will give error becasue calc is a final class

//Also final method can not be override.

public class eighteen{
    public static void main(String a[]){
        // A obj = new B();
        //refererce of suberclass and object of subclass

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show(); // it will print In B show (Object is being called irrespective of the reference)

        //using final keyword we make contants in java
        final int x = 10;
        System.out.println(x);
    }
}