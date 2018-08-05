package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]mat= new int[n][n];
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%d° linha %d° coluna: ",i+1,j+1);
				mat[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%d ",mat[i][j]);
			}
			System.out.println("\n");
		}
		
		sc.close();
	}
}
