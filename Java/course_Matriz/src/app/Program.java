package course_Matriz.src.app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int negative = 0;

        int n = Integer.parseInt(sc.nextLine());

        int[][] matriz = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j]<0){
                    negative++;
                }
            }
            sc.nextLine();
        }

        System.out.println("Main diagonal:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.print("\nNegative numbers = " + negative);

        sc.close();
    }
}