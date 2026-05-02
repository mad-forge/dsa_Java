import java.util.Scanner;
public class methods {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.println("The sum is: " + sum(a, b));


    }
    public static int sum(int a, int b){
        return(a + b);
    }
}
