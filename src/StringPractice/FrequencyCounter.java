package StringPractice;

public class FrequencyCounter {
    public static void main(String[] args) {
        String str = "shashwat";
        char target = 's';
        int count = 0;

        for(char c : str.toCharArray()){
            if( c == target){
                count ++;
            }
        }
        System.out.println(target + "the frequency is: " + count);
    }
}
