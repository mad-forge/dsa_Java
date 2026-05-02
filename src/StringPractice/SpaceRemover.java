package StringPractice;

public class SpaceRemover {
    public static void main(String[] args) {
        String str = "My name is Shashwat";
        String result = "";

        for(char c : str.toCharArray()){
            if(c != ' '){
                result = result + c;
            }
        }
        System.out.println("Clean String: " + result);
    }
}
