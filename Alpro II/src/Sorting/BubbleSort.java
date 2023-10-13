package Sorting;

import java.util.Scanner;

public class BubbleSort {
	int N = 5;
	int []A = new int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			A[i] = 0;
		}
	}
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N; i++) {
			System.out.print("Data ke-"+i+":");A[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}
	
	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data ke "+i+" adalah "+A[i]);
		}
	}
	
	
	void Bubblesort(int kodeurut) {
		int temp;
		
		for (int tahap = 1; tahap < N-1; tahap++) {
			for (int i=0; i<N; i++) {
				if (kodeurut == 1) {
//				Mengurut Membesar
					if (A[i] > A[i+1]) {
						temp = A[i];
						A[i] = A[i+1];
						A[i+1] = temp;
					}
				}else {
//	Mengurut Mengecil
					
					if (A[i] < A[i+1]) {
			
						temp = A[i];
						A[i] = A[i+1];
						A[i+1] = temp;
					}
				}
			}
		}
	}
	
	void BubbleSortMembesar() {
		int temp;
		
		for (int tahap = 1; tahap <= N-1; tahap++) {
			for (int i=0; i<=N-tahap-1; i++) {
				if(A[i] > A[i+1]) {
					temp = A[i];
					A[i] = A[i];
					A[i+1] = temp;
				}
			}
		}
	}
	
	void BubbleSortMengecil() {
		int temp;
		
		for (int tahap = 1; tahap <= N-1; tahap++) {
			for (int i=0; i<=N-tahap-1; i++) {
				if(A[i] < A[i+1]) {
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
	}
	
//	Terurut Membesar
	
	void BuubleSort2() {
		int tahap = 1, temp;
		Boolean tukar;
		
		do {
			System.out.println("Tahap ke "+tahap);
			tukar = false;
			for (int i=0; i<=N-tahap-1; i++) {
				if(A[i] < A[i+1]) {
					tukar = true;
					temp = A[i];
					A[i+1] = temp;
				}
			}
			tahap++;
		}while(tahap <= N-1 && tukar == true);
	}
	
	public static void main(String[] args) {
		
		BubbleSort A = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		int x;
		do {
			System.out.print("(membesar)/2(mengecil)/0(stop): ");x = sc.nextInt();
			A.Bubblesort(x);
			A.TampilArray();
		}while(x!=0);
		
		A.BuubleSort2();
		A.TampilArray();

	}

}
