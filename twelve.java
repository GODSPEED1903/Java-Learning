
class Human
{
    //someone ask my address i can share but if someone ask my love name i will not share
    //you decide you want to share or not
    private int age = 22; //this age varible can be access only inside Human class
    private String name = "Aryan";
    //every time create an instance variable make it private

    //they can acces this data with the help of methods
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        //a is local variable and age is instance variable
        //if we want local variable and instance variable has same name then 
        //age = age -> means this instance variable is assinging value to itself
        //local varibale give preference so we have to tell that this is instance variable
        //to solve this issue what we can do is pass object and then update obj.age = age; like this

        //why passing object, it will give the object
        this.age = age; //this respresent the current object
    }
    public void setName(String n){
        name = n;
    }


    public Human(){
        //everytime we create object constructor will be called
        System.out.println("constructor called");
    }

}

public class twelve{
    public static void main(String arg[]){
        //encapsulation -> keep it close and tight, means noone from outside can use it
        Human obj = new Human(); //when you create a object then in heap memory it just create an empty object;
        // obj.name = "Aryan";
        // obj.age = 22;

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(23);
        obj.setName("Harsh");

        //binding data with methods and only way to access data is with methods

        //Bydefault value of string is null;

        //what if i want to assign the value at the time of object creation
        //then we use constructor. constructor is a method. in constructor we dont specify the return type and
        //name should be same as class name
    }
}