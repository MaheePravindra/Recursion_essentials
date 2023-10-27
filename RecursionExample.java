import java.util.*;
public class RecursionExample {
    static int sum=0;
    static void revnum(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum = sum*10+rem;
        revnum(n/10);
    }


    static int revnum2(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    private static int helper(int n, int digit){
        if(n%10==n){//basically units place or n<10
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
    //Main FUnction
    public static void main(String[] args) {
        print(5);
        printrev(5);
        System.out.println();
        printboth(5);
        System.out.println();
        revnum(1234);
        System.out.println(sum);
        System.out.println(revnum2(1234));
    }

    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
        
    }
    static void printrev(int n){
        if(n==0)
            return;
        System.out.println(n);
        printrev(n-1);    
    }

    static void printboth(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printboth(n-1);
        System.out.print(n+" ");    
    }
}
