//WAJP TO COUNT ALL THE VOWELS IN THE STRING.
package methods_java;
import java.util.Scanner;
public class Program4 {
    public static int count_Vowels(String str) {
        int count =0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = sc.nextLine();

        System.out.println("Number of Vowel in the string : " + count_Vowels(str) +"\n");
    }
}
