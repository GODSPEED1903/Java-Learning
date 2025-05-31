class fifth{
    public static void main(String arg[]){
        int  x = 8;
        if(x==8){
            System.out.println("hello");
        }
        else System.out.println("Bye");

        //terniary operator i already know

        int n = 1;
        switch(n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            
            default:
                System.out.println("enter the valid number");
        }


        //if we do not want to write the break then we use '->'
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("holiday");
        }

        //now switch also return
        String result = "";
        result = switch(day){
            case "Saturday", "Sunday" -> return "Holiday";
        }

        //we have dowhile, while and for loop
        int cnt = 1;
        while(cnt<10){
            System.out.println(cnt++);
        }
    }
}