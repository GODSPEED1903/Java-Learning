
class Human{
    private int age;
    private String name;

    //normal constructor is default constructor
    //if we do not write then also a default constrcutor java will give
    public Human(){ 

    }

    public Human(int age, String name){  //parametrized constructor
        this.age = age;
        this.name = name;
    }

    public Human(String name){
        this.age = 12; //not necessary to give
        this.name = name;
    }
}

public class thirteen{
    public static void main(String arg[]){
        Human obj = new Human(22,"Aryan");

        Human obj2; //reference creation
        obj2 = new Human(); //creating object and assigning value to obj2

        new Human(); //this type of objects are anonymous objects
    }
}

//snake case:- (show_my_marks())

//in java we use camel casing(up and down)
// class name and interface :- Human(first letter capital)
//variable and method:- start small. eg:- marks, show()
//constants :- All capital letter, eg:- JWT_SECRET
//if two letter:- showMyMarks()  