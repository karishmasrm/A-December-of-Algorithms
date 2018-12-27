import java.util.*;

public class WordCounter {

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();   String a[] = s.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words+"\n");
    }
}