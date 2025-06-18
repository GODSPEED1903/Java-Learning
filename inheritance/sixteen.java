

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("In A config");
    }
}

class B extends A{
    //in B i want config of A but do not want show() of A
    //so here we will do method overriding
    public void show(){
        System.out.println("In B Show");
    }
}

public class sixteen {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
    }
}