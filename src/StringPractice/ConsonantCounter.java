package StringPractice;

public class ConsonantCounter {
    public static void main(String[] args) {
        String str = "Shashwat";
        int count = 0;

        str = str.toLowerCase();

        for(char c : str.toCharArray()){
            if (c >= 'a' && c <= 'z'){

                if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ){
                    count ++;
                }

            }
        }
        System.out.println("Total consonants: " + count);
    }
}
