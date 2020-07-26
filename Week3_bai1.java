package week3_bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Week3_bai1 {
    // compute greatest common divisor of $a and $b
    public static int gcd(int a, int b) {
        while(a!= b){
        if(a>b) a= a-b;
        else b= b-a;
        }
        return a;  
        
    }

    // compute the fibonacci of $n
    public static int fibonacci(int n) {
        int f0=0;
        int f1=1;
        int fn=1;
        if (n==0||n==1) return n;
        else {
            for (int i=2;i<n;i++){
                f0=f1;
                f1=fn;
                fn=f0+f1;
            }
        }
        return fn;
    }
    
    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
     public static boolean isPrimeNumber(int n) {
        if (n<2){
            return false;
        }
        for (int i=2;i<=sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void sieveEratosthenes(int n) {
        System.out.println("Các số nguyên tố là: ");
        for (int i=0;i<n;i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Số a: ");
        int a=s.nextInt();
        System.out.println("Số b: ");
        int b=s.nextInt();
        System.out.println("Số n: ");
        int n=s.nextInt();
        System.out.println("UCLN của a và b là: " + gcd(a,b));
        System.out.println("Số Fibonacci n là: "+fibonacci(n));
        sieveEratosthenes(n);
        
    }
}