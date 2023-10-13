package Larik;

import java.util.Scanner;

public class LarikInt2 {
	int N=3;
	int[] A= new int[N];

// Prosedur Inisialisasi Array
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			A[i] = 0;
		}
	}
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N;i++) {
			System.out.print("Data ke-"+i+":");A[i]=sc.nextInt();
		}
	}
	
	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.println("Data ke "+i+" adalah "+A[i]);
		}
	}
	
	void Rata() {
		int total = 0;
		for (int i=0; i<N;i++) {
			total = total + A[i];
		}
		double rata = (double)total/N;
		System.out.println("Rata-rata adalah: "+ rata);	
	}
	
	int GetElement(int i) {
		return A[i];
	}
	
	void SetElement(int i) {
		Scanner sc = new Scanner(System.in);
	}
	
//	isi eksekusi
	public static void main(String[] args) {
		LarikInt2 A = new LarikInt2(); // memanggil class
	
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		A.Rata();
	}
}
