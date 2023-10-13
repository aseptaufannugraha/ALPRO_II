package Matriks;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MainMatriks {
	
	static void PenjumlahanMatriks(MatriksInt A, MatriksInt B, MatriksInt C) {
		int x = 0;
		
		if (A.M == B.M && A.N == B.N) {
			for (int i=0; i<A.M; i++) {
				for (int j=0; j<A.N; j++) {
				x = A.GetElement(i, j) + B.GetElement(i, j);
				C.SetElement(i, j, x);
				}
			}
		}else {
			System.out.println("Tidak bisa");
		}
	}
	
	static void PenguranganMatriks(MatriksInt A, MatriksInt B, MatriksInt C) {
		int x = 0;
		
		if(A.M == B.M && A.N == B.N) {
			for (int i=0; i<A.M; i++) {
				for (int j=0; j<A.N; j++) {
				x = A.GetElement(i, j) - B.GetElement(i, j);
				C.SetElement(i, j, x);
				}
			}
		}else {
			System.out.println("Tidak bisa");
		}
	}
	
//	static void PerkalianMatriks(MatriksInt A, MatriksInt B, MatriksInt C) {
//		int x = 0;
		
//		for(int i=0; i<A.M; i++) {
//			for (int j=0; i<A.N; j++) {
//				for (int k=0; k<A.M; k++) {
//				x+ = A.GetElement(i, k) * B.GetElement(k, j);
//				}
//				C.SetElement(i, j, x);
//				x = 0;
//			}
//		}
//	}
	
	static void PerkalianMatriks(MatriksInt A, MatriksInt B, MatriksInt C) {
		int x = 0;
		
		if(A.N == B.M) {
			for(int i=0; i<A.M; i++) {
				C.SetElement(i, 0, 0);
				for (int j=0; j<A.N; j++) {
					for (int k=0; k<A.M; k++) {
						x += A.GetElement(i, k) * B.GetElement(k, j);
				}
				C.SetElement(i, j, x);
				x = 0;
				}
			}
		}else {
			System.out.println("Tidak bisa");
		}
	}
	
	static void SegitigaAtas(MatriksInt SGA, MatriksInt A) {
		int x = 0;
		
		for(int i=0; i<A.M; i++) {
			for (int j=0; j<A.N; j++) {
				if (i>j) {
					SGA.SetElement(i, j, 0);
				}else {
					x = A.GetElement(i, j);
					SGA.SetElement(i, j, x);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MatriksInt A = new MatriksInt();
		MatriksInt B = new MatriksInt();
		MatriksInt C = new MatriksInt();
		MatriksInt SGA = new MatriksInt();
		Scanner sc = new Scanner(System.in);
		
		A.InitMatriks();
		A.InputMatriks();
		System.out.println("Menampilkan Matriks A");
		A.TampilMatriks();
		
		B.InputMatriks();
		System.out.println("Menampilkan Matriks B");
		B.TampilMatriks();
		
//		PenjumlahanMatriks(A, B ,C);
//		System.out.println("Menampilkan Matriks C (Penjumlahan)");
//		C.TampilMatriks();
		
//		PenguranganMatriks(A, B ,C);
//		System.out.println("Menampilkan Matriks C (Penjumlahan)");
//		C.TampilMatriks();
		
		PerkalianMatriks(A, B, C);
		System.out.println("Menampilkan Matriks C (Perkalian)");
		C.TampilMatriks();
		
//		SegitigaAtas(SGA, A);
//		System.out.println("Menampilkan Matriks SGA");
//		SGA.TampilMatriks();
	}

}
