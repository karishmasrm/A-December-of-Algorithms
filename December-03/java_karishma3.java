import java.util.*;
class First
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("yess"+isLucky(n)); 
}
static boolean isLucky(int n) {
    int c = 0;
    int t = 0;
    int m = n;
    int a = 0, b = 0;
    while(n != 0){
        c++;
        t+=n%10;
        n/=10;
    }
    if(t % 2 != 0) return false;
    for(int i = 0; i < c/2;i++){
        a += m%10;
        m/=10;
    }
    for(int i = 0; i < c/2;i++){
        b += m%10;
        m/=10;
    }
    return b == a? true: false;
}
}