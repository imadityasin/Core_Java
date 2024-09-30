//Write a java method to commute the average of three numbers.
package methods_java;
import java.util.Scanner;
public class Program2 {
    public static void Average() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b=sc.nextInt();
        System.out.println("Enter Number 3: ");
        int c=sc.nextInt();

        int sum=a+b+c;
        int aver=sum/3;

        System.out.println("Average of three Numbers: " + aver);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Calling no parameterized method.
        Average();
    }
}
