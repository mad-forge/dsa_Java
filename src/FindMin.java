//Find min element in array

public class FindMin {
    public static void main(String[] args){
        int [] arr = {20, 12, 15, 2, 64};
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The min element in array is: " + min);
    }
}
