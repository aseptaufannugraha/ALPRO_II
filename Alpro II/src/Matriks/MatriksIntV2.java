package Matriks;

import java.util.Scanner;

public class MatriksIntV2 {

	public static void main(String[] args) {
		
		int M = 3;	//	baris
		int N = 4;	//	kolom
		int[][] A = new int[M][N];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				A[i][j] = 0;
			}
		}
		
		System.out.println("Menginput element-element array");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.println("Data ke- "+i+":"); int X = sc.nextInt();
				A[i][j] = X;
			}
		}
		
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(A[i][j] + "");
			}
			System.out.println();
		}
	}

}
