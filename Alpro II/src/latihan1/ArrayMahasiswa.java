package latihan1;

import java.util.Scanner;

public class ArrayMahasiswa {
//	Membuat function
	int N = 5;
//	Membuat array
	int[]a = new  int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			a[i]=0;
		}
	}
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di input
		for (int i=0; i<N; i++) {
			System.out.print("Data di Index "+(i)+":");a[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}
	
	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data di Index "+(i)+" adalah "+a[i]);
		}
	}
	
	int CariElement(int x) {
		int index = -1;
		for(int i = 0; i < N; i++) {
			if(a[i] == x) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		ArrayMahasiswa A = new ArrayMahasiswa();
		Scanner sc = new Scanner(System.in);
		
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		System.out.println("Mencari index dengan value: "); int k = sc.nextInt();
		int y = A.CariElement(k);
		if(y!=-1) {
			System.out.println("Value "+k+" berada pada index ke: "+y);
		}else {
			System.out.println("Value X "+k+" yang anda cari tidak ada");
		}
	}

}
