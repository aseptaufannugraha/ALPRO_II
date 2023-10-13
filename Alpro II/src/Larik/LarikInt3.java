package Larik;

import java.util.Scanner;

public class LarikInt3 {
	int N = 5;
	int[] A = new int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			A[i] = 0;
		}
	}	
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di input
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
	
	void Rata() {
		int total = 0;
		for (int i = 0; i<N; i++) {
			total = total + A[i];
		}
		double rata = (double)total/N;
		System.out.println("Rata-rata adalah: "+ rata);
	}
	
	int GetElemen(int i) {
		return A[i];
	}
	
	void SetElemen(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Data index ke-"+i+":");A[i]=sc.nextInt();
	}
	
	void BubbleSortMembesar() {
		int temp;
		for (int tahap = 1; tahap<=N-1; tahap++) {
			for (int i=0; i<=N-tahap-1; i++) {
				if (A[i]>A[i+1]) {
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
	}
	
	void BubbleSortMengecil() {
		int temp;
		for (int tahap = 1; tahap<=N-1; tahap++) {
			for (int i=0; i<=N-tahap-1; i++) {
				if (A[i]<A[i+1]) {
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
	}

// Mencari nilai X
	
	int MencariX(int x) {
		int ix = -1;
		int i;
		for (i = 0; i<N; i++) {
			if (A[i] == x) {
				ix = i;
			}
		}
		System.out.println("i keluar dari loop: +i");
		return ix;
		
	}
	
// BinarySearch
	int BinarySearch(int x) {
		  int iawal = 0;
		  int iakhir = N - 1;
		  boolean ketemu = false;
		  int k = 0;
		  
		  while (ketemu == false && iawal <= iakhir) {
		    k = (iawal + iakhir) / 2;
		    if (A[k] == x) {
		      ketemu = true;
		    } else { 
		      if (A[k] > x) {
		        iakhir = k - 1;
		      } else {
		        iawal = k + 1;
		      }
		    }
		  }
		  
		  if (ketemu) {
		    return k;
		  } else {
		    return -1;	    
		  }
		}

	public static void main(String[] args) {
		LarikInt3 A=new LarikInt3(); // manggil class
		Scanner sc = new Scanner(System.in);
		
		A.InitArray();
		A.InputArray();
		A.TampilArray();
//		A.Rata();
//		System.out.print("Tampil elemen keberapa :");int k=sc.nextInt();
//		System.out.println("Tampi elemen :" + A.GetElemen(k));
		
//		A.SetElemen(k);
//		A.TampilArray();
		A.BubbleSortMembesar();
		A.TampilArray();
		A.BubbleSortMengecil();
		A.TampilArray();
//		A.MencariX();
//		A.BinarySearch();


	}

}
