class A{
    int age;

    public void show(){
        System.out.println("IN A Show");
    }

    class B{
        public void config(){
            System.out.println("in B config");
        }
    }
}

public class twentythree{
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        //everytime we comple we get class files so when we comple this we will get two files A.class and A$B.class
        //B is innerclass of A

        A.B obj2 = obj.new B (); //to access classB you need object of A

        //if we make classB as static class then we do not need object of A
        //A.B obj2 = new A.B();
        //static can be only used for inner class. we can't we use for A
    }
}