
import java.util.ArrayList;
import tools.calc;

//like this we import packages. System.out is also imported from java.lang.* , * means import all files from that package

//if classes are in same package no need to mention public we can access it.
//but if classes are in different packages then we have to mention the modifies(public,private,protected)

//private variable can only be used in same class, irrespective of package.

//if we don't mention anything then default access modifier(can be access in the same package). (In same package only)

//protected access modifier -> it can not be used in Different package non subclass.

//we should not have two public classes in the same file
//try to make your instance variable private


public class Demo{
    public static void main(String a[]){
        ArrayList arr = new ArrayList();
    }
    calc obj = new calc();
}