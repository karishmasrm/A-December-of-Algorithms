import java.util.*;
public class CaesarCipher 
{ 
    public static StringBuffer encrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String text = sc.nextLine(); 
        int s =sc.nextInt(); 
        System.out.println("Encoded Output: " + encrypt(text, s)); 
    } 
} 