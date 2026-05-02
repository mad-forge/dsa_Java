package StringPractice;

public class UpperCaseConverter {
    public static void main(String[] args) {
        String str = "shashwat";
        String result = "";

        for (char c : str.toCharArray()){
            if ( c >= 'a' && c <= 'z' ){
                char capitalChar = (char) (c - 32);

                result = result + capitalChar;
            } else {
                result = result + c;
            }
        }
        System.out.println("Uppercase String: " + result);
    }
}
