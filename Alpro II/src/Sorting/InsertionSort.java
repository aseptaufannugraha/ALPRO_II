package Sorting;

import java.util.Scanner;

public class InsertionSort {
	
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
	
	void InsertionSort() {
		int tahap, temp, i;
		for (tahap=1; tahap < N-1; tahap++)
		{
			temp = A[tahap];
			i = tahap - 1;
			
			while (i >= 0 && A[i] > temp)
			{
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = temp;
		}
	}

	public static void main(String[] args) {
		InsertionSort A = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
//		int x;
//		do {
//			System.out.print("1(membesar)/2(mengecil)/0(stop):"); x = sc.nextInt();
//			A.BubbleSort(x);
//			A.TampilArray();
//		}while(x!=0);
		
		A.InsertionSort();
		A.TampilArray();

	}

}
