

//we specify behaviours with the help of methods

class Computer {
    public void playMusic(){
        System.out.println("Music playing");
    }
    public String giveMePen(int cost){
        if(cost >=5) return "Pen";
        else return "Nothing";
    }
}

class Calculator {
    public int add(int n1, int n2){
        return n1 + n2;
    }
    //this is method overloading(different number of parameters of same number with different types)
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    //method name and arguemnt types matter, these both should not be same otherwise we will get error
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class seven{
    public static void main(String arg[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.giveMePen(2);
        System.out.println(str);


        Calculator obj2 = new Calculator();
        int r1 = obj2.add(3,10);
        System.out.println(r1);
    }
}