package StringPractice;

public class VowelCounter {
    public static void main(String[] args) {
        String str = "Shashwat";
        int count = 0;
        char[] arr = str.toCharArray();

        for( char c : arr){
            if(c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u' ){
                count ++;
            }
        }
        System.out.println("Total Vowels: " + count);
    }
}
