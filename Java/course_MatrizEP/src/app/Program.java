package course_MatrizEP.src.app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc .nextInt(), n = sc.nextInt();

        int[][] matriz = new int[m][n];

        sc.nextLine();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int x = sc.nextInt();
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matriz[i][j]==x){
                    System.out.print("\nPosition " + i + "," + j + ":");
                    if(j-1<0){
                    }
                    else{
                        System.out.print("\nLeft: " + matriz[i][j-1]);
                    }
                    if(j+1>=n){
                    }
                    else{
                        System.out.print("\nRight: " + matriz[i][j+1]);
                    }
                    if(i-1<0){
                    }
                    else{
                        System.out.print("\nUp: " + matriz[i-1][j]);
                    }
                    if(i+1>=m){
                    }
                    else{
                        System.out.print("\nDown: " + matriz[i+1][j]);
                    }
                    count++;
                }
            }
        }

        if(count==0){
            System.out.println("The number entered does not exist in the matrix");
        }

        sc.close();
    }
}