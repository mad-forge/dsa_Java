package StringPractice;

public class WordCounter {
    public static void main(String[] args) {
        String str = "My name is Shashwat";
        int spaces = 0;

        for (char c : str.toCharArray()){
            if(c == ' '){
                spaces++;
            }
        }
        System.out.println("Total words is: " + (spaces + 1));
    }
}
