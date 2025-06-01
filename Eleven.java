
class Mobile{
    //these are instance variable

    //what if i want a common value for all the objects
    //like i want name should be same for all the objects
    String brand;
    int price;
    String network;
    // String name;
    //my making name variable static we make this name variale common to all objects
    static String name;
    //common ariable used by all
    //static variable should be called with their class name not object name

    public void show(){
        System.out.println(brand + ", " + price + ", " + network + ", " + name);
    }
    //this show is intance method not a static method

    public static void show1(Mobile Obj){
        System.out.println("inside the static method");
        System.out.println(Obj.brand + ", " + Obj.price + ", " + Obj.network + ", " + name);
    }
    //you can use static variable inside a static method.



    // we can initialize static variable inside the constructor
    public Mobile(){
        brand = "";
        price = 400;
        name = "Phone"; //why name has to initialize every time when it is static
    }
}

public class Eleven{
    public static void main(String arg[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 50000;
        obj1.network = "jio";
        // obj1.name = "smartphone";
        Mobile.name = "Smartphone";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 40000;
        obj2.network = "airtel";
        obj2.name = "smartphone";

        //here two different objects created in heap memory and in stack these obj1 and obj2 points to address of these in heap
        Mobile.show1(obj2); 

        //means if you do not create the object then it will not load the class also.
        //but say if we want to load the class
        //there is a class called Class. 
        
        try {
            Class.forName("Mobile"); //this load the class, and also this throw an exception thats why try catch
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //main is static because if main is not static we have to create object of demo, and main is the starting point so DEADLOCK
    //everytime when we create objects -> two steps class loads and objects instantiated.
}