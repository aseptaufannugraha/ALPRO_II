package Matriks;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MatriksInt {
	
	int M = 3;	//	baris
	int N = 3;	//	kolom
	int[][] A = new int[M][N];
//	int P = 3;
//	int Q = 3;
//	int[][] A = new int[P][Q];
	
	Scanner sc = new Scanner(System.in);
	
	void InitMatriks() {
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				A[i][j] = 0;
			}
		}
	}
	
	void InputMatriks() {
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Data baris "+i+ "kolom "+j+":"); int x = sc.nextInt();
				A[i][j] = x;
			}
		}
	}
	
	void TampilMatriks() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<M; i++) {
			for (int j = 0; j<N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void SegitigaAtas() {
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (i>j) {
					A[i][j] = 0;
				}
			}
		}
	}
	 
	 int GetElement(int i, int j) {
		 return A[i][j];
	 }
	
	 void SetElement(int i, int j, int x) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Datanya "+i+" "); A[i][j] = x;
	 }
	
	public static void main(String[] args) {
		MatriksInt A = new MatriksInt();
		MatriksInt B = new MatriksInt();
		Scanner sc = new Scanner(System.in);
		
		A.InitMatriks();
		A.InputMatriks();
		System.out.println("Menampilkan Matriks A");
		A.TampilMatriks();
		
		B.InputMatriks();
		System.out.println("Menampilkan Matriks B");
		B.SegitigaAtas();

		B = A;
		System.out.println("Menampilkan Matriks B sebelum buat segitiga Atas");
		B.TampilMatriks();
		
		System.out.println("Menampilkan Matriks Asli setelah buat SGA");
		A.TampilMatriks();
	
		
		
		
		
	}

}
