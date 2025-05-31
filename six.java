class Calculator{
    //class can also have variables
    public int add(int num1, int num2){ //this add is a method
        return num1 + num2; 
    }
}

public class six{
    public static void main(String arg[]){
        //object -> property and behaviour
        //jvm creates objects
        int num1 = 5, num2= 6;

        // Calculator calc;  -> here we are creating a reference not an object
        Calculator calc = new Calculator(); //that how object is created
        int result = calc.add(num1,num2);
        System.out.println(result);



        /* JDK convert the java code to byte code which will run on the machine. JVM runs the code.
            we have JRE on top of JVM because in jRE we will have all the extra class, in inbuilt class. 
            and JDK is the upper layer, we have on top JDK which has JRE which has JVM
         */
    }
}