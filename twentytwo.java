

abstract class car{
    //we have to implement this function but still we are able to access this.
    // public void drive(){

    // }

    //instead of implementing this drive() we can also declare this
    public abstract  void drive();  //you can mark it as abstract that i am giving an abstract idea. we have to make this class as abstract also.

    // whatever class that extends this class must contain this abstract method or make it abstract
    public void playMusic(){
        System.out.println("Play music");
    }
    //no compulsion that absract class should contain abstract methods
}

public class twentytwo{
    public static void main(String ap[]){
        car obj = new car();
        //also we can't create object of abstract class
        obj.drive();
        obj.playMusic();
    }
}