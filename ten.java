

//string in double quotes, char in single quotes
public class ten{
    public static void main(String arg[]){
        String name = new String("Aryan");
        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));

        String name1 = "Aryan"; //this syntax will create object for you. no need to worry about object creation

        String s1 = "Harsh";
        String s2 = "Harsh";
        //here above we are not create two seperate objects. In stack these s1 and s2 will have same address
        System.out.println(s1==s2); //true
        //in heap we have special area called string constant pool. Every string we create in java is constant we can not change it.
        //thats how we save the memory. 
        s1 = s1 + "Aggarwal"; //here new data/string created called Harsh Aggarwal and saved in string constant pool. and s1 in stack will point to that. Harsh which was before also 
        //be present in the pool.
        //now this "Harsh" is eligible for garbage collection


        //Mutable strings -> that can be change
        //Immutable Strings -> that can not change
        //By default strings are immutable.
        //String buffer and string builder are use for mutable strings


        StringBuffer sb = new StringBuffer("Aryan"); //string buffer give buffer of size 16 bytes
        System.out.println(sb.capacity()); 
        //if we put "Aryan" in sb then its capacity become 21
        System.out.println(sb.length());
        sb.append(" Dumyan");
        sb.insert(0,"java ");

        String str = sb.toString();
    }
}