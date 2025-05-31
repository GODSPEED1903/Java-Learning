class fourth{
    public static void main(String arg[]){
        //can not put integer into byte and vice versa possible
        byte b = 127;
        int a = 12;
        b = (byte) a; //this is casting. this will do module with range(256) of byte
        
        float f = 5.6f;
        int x = (int) f;

        //type promotions -> when byte*byte -> there type promoted and become int



        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2; // we can do +, -, *, /(questionet), %(remainder)

        num1++; //post increment
        ++num1; //pre increment

        System.out.println(result);


        //operators, >, <, ==, !=, <=, >=, 
        double z= 4.9;
        double y= 4.11;
        System.out.println(z>y);


        //logical operator :- &, |, ! (and, or, not) or we can use &&, ||, !
        
    }
}