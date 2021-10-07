package DataStructures.recursion;

public class Recursion {

    public static void main(String[] args) {


        firstMethod();
//        secondMethod();
//        thirdMethod();
//        fourthMethod();
    }



    public static void firstMethod(){
        secondMethod();
        System.out.println("First method called");
    }
    public static void secondMethod(){

        thirdMethod();
        System.out.println("Second  method called");
    }
    public static void thirdMethod(){

        fourthMethod();
        System.out.println("Third method called");
    }

    public static void fourthMethod(){
        System.out.println("fourth method called");
    }

}
