//for specific constants we can create enum

//by default enum in java extends an enum class
enum Status{
    Running, Failed, Pending, Success;
}

enum laptop{
    Macbook(10000), hp(2000), windows(3000), linus(90000);
    //here in bracked we put price, but how enum know that this is price so for that we define price and write constructor for this
    
    private int price;
    private laptop(int price){
        this.price = price;
    }
    //here we defined parametrized constructor so now all the enums should have price

    //now to access price we can write our own getter and setters

}

public class twentysix{
    public static void main(String a[]){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); //this will tell the number(index)

        Status[] r = Status.values(); //this give all value of Status
        for(Status v: r){
            System.out.println(v);
        }
    }
}