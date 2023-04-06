import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        System.out.println("Enter the  Total Marks:");
        Scanner in= new Scanner(System.in);
        int tot=in.nextInt();
        int tm=5*tot;
        System.out.println("Subject 1 marks:");
        int a = in.nextInt();
        System.out.println("Subject 2 marks:");
        int b = in.nextInt();
        System.out.println("Subject 3 marks:");
        int c = in.nextInt();
        System.out.println("Subject 4 marks:");
        int d = in.nextInt();
        System.out.println("Subject 5 marks:");
        int e = in.nextInt();
        int sum =a+b+c+d+e;
        float per =(sum/tm)*100;

        System.out.println(per);


    }
}
