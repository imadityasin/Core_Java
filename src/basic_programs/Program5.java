//Write a Java program that takes two numbers as input and displays the product of two numbers.
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
package basic_programs;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
//        Creating Object of Scanner Class
        Scanner sc=new Scanner(System.in);

//        Taking User Input
        System.out.println("Enter a Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2=sc.nextInt();

//        Calculating and Displaying the result
        System.out.println(num1 + " * " + num2 + " = " + num1*num2);

    }
}
