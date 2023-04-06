import  java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometer:");
        float km = sc.nextFloat();
        float miles = (km/1.609f);
        System.out.println("Distance in Miles is: "+miles);
    }
}
