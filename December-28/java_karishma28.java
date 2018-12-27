import java.util.*;
public class Diagonals
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int flag=0;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { arr[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<n;i++)
        { for(int j=i+1;j<m-1;j++)
        {
        if(arr[i][j]==arr[i+1][j+1]){
        flag=1;}
        }}
        if(flag==1)
        System.out.println("Identical Diagonals");
        else
        System.out.println("Non Identical Diagonals");
        
    } 
    }