import java.util.*;
public class java_karishma7 { 
      static Scanner sc=new Scanner(System.in);
           static final int N =sc.nextInt();  
    static void getCofactor(int mat[][],  
             int temp[][], int p, int q, int n) 
    { 
        int i = 0, j = 0; 
        for (int row = 0; row < n; row++) 
        { 
            for (int col = 0; col < n; col++) 
            {  
                if (row != p && col != q) 
                { 
                    temp[i][j++] = mat[row][col]; 
                    if (j == n - 1) 
                    { 
                        j = 0; 
                        i++; 
                    } 
                } 
            } 
        } 
    } 
    static int determinantOfMatrix(int mat[][], int n) 
    { 
        int D = 0; 
        if (n == 1) 
            return mat[0][0]; 
        int temp[][] = new int[N][N]; 
        int sign = 1;  
        for (int f = 0; f < n; f++) 
        { 
            getCofactor(mat, temp, 0, f, n); 
            D += sign * mat[0][f]  
               * determinantOfMatrix(temp, n - 1); 
            sign = -sign; 
        } 
      
        return D; 
    } 
    static void display(int mat[][], int row, int col) 
    { 
        for (int i = 0; i < row; i++) 
        { 
            for (int j = 0; j < col; j++) 
                System.out.print(mat[i][j]); 
                  
            System.out.print("\n"); 
        } 
    } 
    public static void main (String[] args) 
    { 
          int mat[][]=new int[N][N];
          for (int i=0;i<N;i++)
          {
            for(int j=0;j<N;j++)
            {
                 mat[i][j]=sc.nextInt();
            }
          }
      
        System.out.print("Determinant " +  
                    "of the matrix is : "+ 
             determinantOfMatrix(mat, N)); 
    } 
} 