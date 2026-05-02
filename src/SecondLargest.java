public class SecondLargest {
    public static void main(String[] args){
        int [] arr = {3, 7, 2, 9, 5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];

            if(num > first){
                second = first;
                first = num;
            }
            else if(num > second && num != first){
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
