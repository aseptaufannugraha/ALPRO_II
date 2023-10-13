package quiz01;

import java.util.Scanner;

public class BinarySearch {
	
	int N = 6;
	int []A = new int[N];
	
	void InitArray() {
		A[0] = 5;
		A[1] = 8;
		A[2] = 10;
		A[3] = 13;
		A[4] = 26;
		A[5] = 30;
	}
	
	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data ke "+(i)+" adalah "+A[i]);
		}
	}
	
	int search(int x) {
		int index = -1;
		int i = 0;
	
	while((i < N-1) && (A[i] !=x)) {
		i++;
	}
	if(A[i] == x) {
		index = 1;
	}
	return index;
}
	
	int BinarySearch(int x) {
		int ia, ik, it;
		Boolean ketemu = false;
		ia = 0;
		ik = N-1;
		it = 0;
		
		while ((ia<=ik) && (!ketemu)) {
			it = (ia+ik) / 2;
			if (A[it] == x) {
				ketemu = true;
			}else if (A[it] < x) {
				ia = it+1;
			}else {
				ik = it-1;
			}
		}
		
		if (ketemu) {
			return it;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		BinarySearch A = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		
		A.InitArray();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value: ");int k = sc.nextInt();
		if (A.BinarySearch(k) >=0) {
			System.out.println("Value "+k+" berada pada index ke: "+A.BinarySearch(k));
		}else {
			System.out.println("Value X "+k+" yang anda cari tidak ada");
		}
	}

}
