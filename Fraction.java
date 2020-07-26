package week3_bai2;

import java.util.Scanner;

public class Fraction {
    private int numerator,denominator;

    public Fraction(){
        
    }
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    
    public Fraction add(Fraction other) {
        Fraction sum = new Fraction();
        sum.setNumerator(this.getNumerator()* other.denominator + other.numerator * this.getDenominator());
        sum.setDenominator(this.getDenominator() * other.denominator);
        return sum;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        Fraction tru = new Fraction();
        tru.setNumerator(this.getNumerator()*other.denominator - other.numerator*this.getDenominator());
        tru.setDenominator(this.getDenominator() * other.denominator);
        return tru;
    }

    // multiple
    public Fraction multiple(Fraction other) {
        Fraction nhan = new Fraction();
        nhan.setNumerator(this.getNumerator()*other.numerator);
        nhan.setDenominator(this.getDenominator() * other.denominator);
        return nhan;
    }

    // divide
    public Fraction divide(Fraction other) {
        Fraction chia = new Fraction();
        chia.setNumerator(this.getNumerator()*other.denominator);
        chia.setDenominator(this.getDenominator() * other.numerator);
        return chia;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction){
            if (this.subtract((Fraction) obj).getNumerator()==0){
                return true;
            }else return false;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        Fraction f1= new Fraction(m,n);
        int a=s.nextInt();
        int b=s.nextInt();
        Fraction f2=new Fraction(a,b);
        System.out.println("Tổng 2 phân số: "+ f1.add(f2) ); 
        System.out.println("Hiệu 2 phân số: "+ f1.subtract(f2));
        System.out.println("Tích 2 phân số: "+ f1.multiple(f2));
        System.out.println("Thương 2 phân số: "+ f1.divide(f2));
        if (f1.equals(f2)){
            System.out.println("2 phân số bằng nhau ");
        }else System.out.println("2 phân số không bằng nhau");
    }
}
