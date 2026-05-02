public class Arrays {
    public static void main(String[] args) {

        int arr [][] = {{1,56,3}, {21,20,19}};
        int minValue = arr[0][0];

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < minValue)
                    minValue = arr[i][j];
            }
        }
        System.out.println("The MinValue of 2D array is: " + minValue);

//        int arr [][] = {{1,56,3}, {21,20,19}};
//        int maxValue = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                if(arr[i][j] > maxValue)
//                maxValue = arr[i][j];
//            }
//        }
//        System.out.println("The MaxValue of 2D array is: " + maxValue);

//        int arr[][] = { {1,2,3},{1,2,3}};
//
//        int multiply = 1;
//
//        for (int i=0; i < arr.length; i++){
//            for(int j=0; j < arr[i].length; j++){
//                int value = arr[i][j];
//                multiply = multiply * value;
//            }
//        }
//        System.out.println("The multiplication of 2D array is: " + multiply);



//        for(int i=0; i < arr.length; i++){
//            for(int j=0; j < arr[i].length; j++){
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//
//        }
//        System.out.println("The sum of 2D array is: " + sum);

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length -1; i++){
//            for (int j =0; j <= arr[i].length-1; j++){
//                System.out.println("Provide value for row = " + i + " and column = " + j);
//                arr[i][j] = sc.nextInt();
//            }
//
//
//        }
//        for(int rowIndex = 0; rowIndex <= arr.length -1; rowIndex++){
//             for(int colIndex = 0; colIndex <= arr[rowIndex].length -1; colIndex++){
//               System.out.print(arr[rowIndex][colIndex] + " ");
//             }
//            System.out.println();
//        }


//        //declaration
//        int arr[][];
//        //allocation
//        arr = new int[3][4];
//        //initialization
//        int brr[][] = {{1,2}, {2,3}, {3,4}, {4,5}};
//
//       // System.out.println(brr[0][1]);
//        int rowLength = brr.length;
//        //int colLength = brr[0].length;
//        for(int rowIndex = 0; rowIndex <= rowLength -1; rowIndex++){
//            for(int colIndex = 0; colIndex <= brr[rowIndex].length -1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] < minValue){
//                minValue = arr[i];
//            }
//        }
//        System.out.println("The min value: " + minValue);

//        int arr[] = {3,2,-5,21,10};
//        int maxValue = arr[0];
//        int n = arr.length;
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] > maxValue){
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("The max value: " + maxValue);


//          int arr[] = {2,3,10,20};
//          int multiply = 1;
//          int n = arr.length;
//
//          for (int i = 0; i < n; i++){
//              int value = arr[i];
//              multiply = multiply * value;
//          }
//        System.out.println("The multiplication of array is: " + multiply);



//        int arr[] = {10,20,30,40,50};
//        int sum = 0;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println("The sum of array is: " + sum);
    }
}
