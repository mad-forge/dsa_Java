import java.util.Scanner;
//if else & switch

//voting system

//public class conditionalProblems {
//    public static void main(String[] args){
//       int age = 20;
//       if(age >= 18) {
//           System.out.println("Eligible to vote");
//       }else {
//           System.out.println("Not eligible to vote");
//       }
//    }
//}

//positve, negative, zero

//public class conditionalProblems {
//    public static void main(String[] args){
//        int num = 6;
//        if (num > 0){
//            System.out.println("Positive number");
//        } else if (num < 0) {
//            System.out.println("Negative number");
//        }else {
//            System.out.println("zero");
//        }
//    }
//}

//traffic light

//public class conditionalProblems {
//    public static void main(String[] args){
//        String light = "Red";
//        switch (light) {
//            case "Red":
//                System.out.println("Stop!");
//                break;
//            case "Green":
//                System.out.println("Go!");
//                break;
//            default:
//                System.out.println("Invalid Light");
//        }
//    }
//}

// multiplication table

//public class conditionalProblems {
//    public static void main(String[] args){
//        Scanner sc = new  Scanner(System.in);
//
//        System.out.println("Enter the number of which you want multiplication table: ");
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }
//    }
//}

//factorial of a number

//public class conditionalProblems {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of which you want factorial: ");
//        int num = sc.nextInt();
//
//        int factorial = 1;
//
//        for (int i = 1; i <= num; i++ ){
//            factorial = factorial * i;
//        }
//        System.out.println("Factorial is: " + factorial);
//    }
//}

//Prime Number Check

//public class conditionalProblems {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to check it is Prime or not: ");
//
//        int num = sc.nextInt();
//
//        boolean isPrime = true;
//        if (num <= 1){
//            isPrime = false;
//        }else {
//            for ( int i = 2; i <= Math.sqrt(num); i++ ){
//                if (num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(num + " is a Prime Number.");
//        } else {
//            System.out.println(num + " is not a Prime Number.");
//        }
//
//        sc.close();
//    }
//}

//Fibonacci Series

//public class conditionalProblems {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//
//        int first = 0, second = 1;
//        System.out.println("Fibonacci series");
//
//        for (int i = 1; i <= num; i++){
//            System.out.println(first + " ");
//
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//        sc.close();
//
//    }
//}

// sum of digits

//public class conditionalProblems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//
//         int sum = 0;
//
//         while(num != 0){
//             int digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.println("Sum of digit: " + sum);
//         sc.close();
//    }
//}

// reverse number

public class conditionalProblems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int original = num;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number of " + original + " is: " + reverse);

        sc.close();
    }
}