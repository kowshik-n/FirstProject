package DataStructures.recursion;

public class Number {

    public static void main(String[] args) {

        Number rec=new Number();
        rec.number(4);

    }

    public static void  number(int n){

        if(n<1){
            System.out.println("n is less than zero");
        }
        else {
            number(n - 1);
            System.out.println(n);
        }

    }


}
