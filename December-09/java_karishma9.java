import java.net.URL; 
import java.util.*;
  
public class Test { 
  
    /* Returns true if url is valid */
    public static boolean isValid(String url) 
    { 
        /* Try creating a valid URL */
        try { 
            new URL(url).toURI(); 
            return true; 
        } 
          
        // If there was an Exception 
        // while creating URL object 
        catch (Exception e) { 
            return false; 
        } 
    }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String url1 =sc.nextLine();
        if (isValid(url1))  
            System.out.println("Yes"); 
        else
            System.out.println("No");      
              
        
    } 
} 