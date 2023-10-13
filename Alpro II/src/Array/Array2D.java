package Array;

import java.util.Scanner;

public class Array2D {
//	Jumlah penyimpanan array
	int N = 5;
	
//	Membuat array
	String[][] A = {
			{"Rian", "sama1"},
			{"Tugas", "Sudah", "Selesai"}
	};
	
	int[] B =  {1,2,3};
	
	String[] C = new String[N];
	void InitArrayC() {
		C[0] = "Rian";
		C[1] = "sama1";
	}

	public static void main(String[] args) {
//	Memanggil class
		Array2D A = new Array2D();
		
//	Supaya bisa di inpukan
		Scanner sc = new Scanner(System.in);
	}

}
