//compile, runtime, logical errors we have

//problem comes with runtime errors(execution stops)
//exceptions are runtime error and we have to handle them





public class twentyEight{
    public static void main(String a[]){

        //int i = 9; //the is normal statement
        //int j = 8/i; //here problem bec if i become 0 -> mathematic exception

        //what we can do is to put this in seperate block
        int i=0;
        int j = 0;
        
        int[] nums = {1,2,3,4};

        try
        {
            j = 8/i;
        }catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);

        //we can have multiple catch blocks
        try {
            j = 8/i;
            if(j==0){
                throw new ArithmeticException("i do not want to print zero"); //we can pass message in construtor
                //we can creating custom exception by creating a class with extends it to exception
            }
            System.out.println(nums[5]); //this throw excpetion
            System.out.println(nums[1]);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        } //Exception is superclass of all subclasses so it should be at end

        // object class -> throwable class -> error class(thread death, io error, virtual memory error), exception class(run time exception(arthemtic, array out of bound), )
        //all runtime exceptions are uncheck exception

    }
}