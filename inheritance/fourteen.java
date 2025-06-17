//Inheritance:- 
//laptop IS a computer(latop got features from computer)
//fortuner IS a car

// we have seperate class called Calculator and ScientificCalculator
//ScientificCalculator inherit basic features for Calculator
//(parent,super,base) class -> (child,sub,derived) class


//javac <file_name> -> to compile the file

//if we only compile this file then only fourteen.class will be created but if we initialize the object of calc
//then calc.class also be created


public class fourteen {
    public static void main(String a[]){
        calc obj = new calc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(34,12);
        System.out.println(r1);
        System.out.println(r2);
    }
}