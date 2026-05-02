//sum of all elements

public class Sum {
    public static void main(String[] args){
        int [] arr = {10, 16, 18, 78, 67};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements is: " + sum);
    }
}
