//in JVM we have stack and heap memory

class Calculator{
    int num;
    //num is instance variable
    public int add(int n1, int n2){
        //n1 and n2 are local variable
        return n1 + n2;
    }
}

//every method has its own stack
//in stack we have pair(variable name, value)

//main method ka apna stack hoga jisme data hoga
//fir add method ka apna stack hoga jiske andar n1 and n2 hoga
//r1 will be in main stack
class eight{
    public static void main(String arg[]){
        int data = 10;
        Calculator obj = new Calculator();  //obj is reference variable(not an object)
        //obj will be declared inside main stack.
        //new Caulculator will create object inside the heap memory

        //and in this heap memory we have two section.
        //first section has all instance variable. not local variable because they are part of stack
        //this heap only have method declaration, but actual area which add() will consume will be stack
        //the address of this heap will be stored in stack of that obj

        // link between stack and heap because of this address link

        //
        int r1 = obj.add(3,5);
    }
}