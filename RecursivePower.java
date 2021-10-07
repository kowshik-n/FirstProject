package DataStructures.recursion;

public class RecursivePower {

    public static void main(String[] args) {

        System.out.println(powerOfTwo(5));
    }

    public static int powerOfTwo(int n){
        if(n==0) {
            return 1;
        }else {
            var power =2*powerOfTwo(n-1);
            return power;

        }
    }
}
