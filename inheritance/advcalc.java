//to get features of calc in advcalc we use inheritance

//also if we do not have java file of calc but have class file of calc still also use can use it here usign inheritance
//advclac->subclass, calc0>superclass

//we have multilevel inheritance
//if only two classes -> single level inheritance

//multiple inheritance in java will not work, means C class extends from A, B (two parents)
//bec if A and B both have same function when in C which function we will choose?(ambiguity problem)

public class advcalc extends calc{
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}