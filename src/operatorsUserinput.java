import java.util.Scanner;

//public class operatorsUserinput {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your first number: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter your second number: ");
//        int b = sc.nextInt();
//
//        if(a > b){
//            System.out.println("Largest number is: " + a);
//        } else {
//            System.out.println("Largest number is: " + b);
//        }
//
//        sc.close();
//    }
//}

//even odd

//public class operatorsUserinput {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Number: ");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0){
//            System.out.println( num + " is even number");
//        } else {
//            System.out.println(num + " is odd number");
//        }
//        sc.close();
//    }
//
//}

// simple interest calculator

//public class operatorsUserinput {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Principal amount (P): ");
//        double principal = sc.nextDouble();
//
//        System.out.println("Enter Rate of Interest (R): ");
//        double rate = sc.nextDouble();
//
//        System.out.println("Enter Time in years (T): ");
//        double time = sc.nextDouble();
//
//        double simpleInterest = (principal * rate * time) / 100;
//
//        double totalAmount = simpleInterest + principal;
//
//        System.out.println("Simple interest = " + simpleInterest);
//        System.out.println("Total amount = " + totalAmount);
//    }
//}

// swap two numbers

//public class operatorsUserinput {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter second number: ");
//        int b = sc.nextInt();
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("First number = " + a);
//        System.out.println("Second number = " + b);
//
//        sc.close();
//
//    }
//}

//Percentage calculator

public class operatorsUserinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter obtained marks: ");
        double obtainedMarks = sc.nextDouble();
        System.out.println("Enter total marks: ");
        double totalMarks = sc.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage + "%");

        sc.close();

    }
}