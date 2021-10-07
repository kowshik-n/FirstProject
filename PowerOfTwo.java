package DataStructures.recursion;

public class PowerOfTwo {


    public static void main(String[] args) {

        System.out.println(powerOfTWo(5));
    }

    public static int powerOfTWo(int n){
        var i=0;
        var power =1;
        while (i<n){
            power*=2;
            i+=1;
        }
        return power;
    }



}
