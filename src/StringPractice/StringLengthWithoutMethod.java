package StringPractice;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String str = "Shashwat";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            count++;
        }
        System.out.println("The length of string: " + count);
    }
}
