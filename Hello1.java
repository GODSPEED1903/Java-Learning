//System.out.print() -> is uesd to print the output to the console without a newline at the end.
//java is platform independent language(run on any machine) because of java virtual machine. JVM is not platform independent. 
//JVM only understand bytecode. java compiler converts java code to bytecode which goes to JVM. JVM start from first file and then goes to other dependency files.
//you have to specify the first file which has main method to run the program.
//exection starts from main method. main will accept string array as argument.
//java need a class name to run the program. class name should be same as file name.
public class Hello1 {
    // main method is the entry point of the program
    public static void main(String[] args) {
        // print "Hello, World!" to the console
        System.out.print("Hello, World!");
    }
}
//javac Hello.java to compile the code and we get Hello.class file. java Hello to run the code.

//JVM is a part of JRE. JRE is a part of JDK. JDK is a part of Java.
