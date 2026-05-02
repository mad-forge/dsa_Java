package StringPractice;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "Shashwat";
        String palindrome = "";

        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            palindrome = palindrome + ch;
        }
        if(str.equals(palindrome)){
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This not Palindrome");
        }
    }
}
