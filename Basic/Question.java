//Add three number
import  java.util.Scanner;
public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int sum =a+b+c;
        System.out.println("Sum of this number is:"+sum);
        }
}
