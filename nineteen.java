//every class in java extends object class

class laptop{
    String model;
    int price;
}


public class nineteen{
    public static void main(String a[]){
        laptop obj = new laptop();
        obj.model = "macbook m1 air";
        obj.price = 100000;
        System.out.println(obj);  // output -> laptop@60438a68
        //because everytime we print the object it will call toString() method. this toString() method present in object class
        //it convert the number into hex(hashCode)

        laptop obj1 = new laptop();
        laptop obj2 = new laptop();

        boolean result = obj1.equals(obj2); //this return false because equals method compare based on their hexadecimal values

        //if you equals two value they should have same value and same hashcode
    }
}