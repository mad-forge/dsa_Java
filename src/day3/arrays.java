package day3;
import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args){
//        int [] rollNumbers = {101,102,103,104,105};
//        System.out.println("Roll Numbers");
//        for (int i = 0; i < rollNumbers.length; i++){
//            System.out.println(rollNumbers[i]);
//        }
//    }
//}

//public class arrays {
//    public static void main(String[] args){
//        int[] arr; //declaration
//        System.out.println("array declared!!");
//    }
//}

//public class arrays {
//    public static void main(String[] args){
//        int [] arr = new int[3]; //declaration + initialization
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//    }
//}

import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}
//Take an array as input from the user. Search for a given number x and print the index at which it occurs



