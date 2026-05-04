package StringPractice;

public class DigitChecker {
    public static void main(String[] args) {
        String str = "12a345b";
        boolean isOnlyDigits = true;

        for(char c : str.toCharArray()){
            if(c < '0' || c > '9'){
                isOnlyDigits = false;

                break;
            }
        }
        if(isOnlyDigits){
            System.out.println("String contains only digits");
        } else {
            System.out.println("String having digit and alphabets");
        }
    }
}
