package Matriks;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MatriksChar {
	int M = 5;
	int N = 5;
	char X;
	char[][] A = new char[M][N];
	
	Scanner sc = new Scanner(System.in);
	
	void InitMatriks() {
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				A[i][j] = 0;
			}
		}
	}
	
//	void InputMatriks() {
//		for (int i=0; i<N; i++) {
//			for (int j=0; j<M; j++) {
//				System.out.print("Data baris "+i+ "kolom "+j+":"); int x = sc.nextInt();
//				A[i][j] = X;
//			}
//		}
//	}
	
	void InputMatriks2() {
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				X = '+';
				if (i == 2 && j == 2) {
					X = 'X';
				}
				A[i][j] = X;
			}
		}
	}
	
	void TampilMatriks() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(A[i][j] +"");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MatriksChar A = new MatriksChar();
		MatriksChar B = new MatriksChar();
		MatriksChar C = new MatriksChar();
		
		Scanner sc = new Scanner(System.in);
		
		A.InitMatriks();
		A.InputMatriks2();
		A.TampilMatriks();
	}

}
