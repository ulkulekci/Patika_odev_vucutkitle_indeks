import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner boy=new Scanner(System.in);
        System.out.println("lütfen boyunuzu metre cinsinden giriniz:");
        double b=boy.nextDouble();
        Scanner kilo=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz:");
      double a=kilo.nextDouble();
       double c=b*b;
        double d=a/c;
        System.out.println("vücut kitle indeksiniz:"+d);

    }
}
