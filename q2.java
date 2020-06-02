import java.util.*;
public class q2 {

    private static boolean palindromeCheck( int number ) {
        int original_num= number;
        int reverse_num=0;

        while(number>0){
            int rem= number%10;
            reverse_num= reverse_num*10 + rem;
            number/=10;
        }

        if( original_num == reverse_num ) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in); 
        int n= scn.nextInt();
        System.out.println( palindromeCheck(n) );
    }
    
}