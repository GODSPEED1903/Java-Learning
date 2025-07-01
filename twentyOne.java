
//java is 99.99% oop but not fully oop because it datatypes like int are not objects

// so we have wrapper class
//for every primitive type we have class for it
// int -> Integer (and this class extends the object class)
//char -> Character
// double -> Double

public class twentyOne {
    public static void main(String a[]){
        int n = 7;
        //Integer num = new Integer(8); // this code is deprecated and will be removed
        Integer num = 8; //autoboxing, this primitive type converted too object that why autoboxing

        int num2 = num.intValue();  //unboxing(we are doing it manually here)
        int num3 = num; //this is auto-unboxing


        String str = "12";
        int num4 = Integer.parseInt(str);
        
    }
}