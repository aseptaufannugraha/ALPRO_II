package quiz01;

import java.util.Scanner;

public class LarikKaryawan {
	
	int N = 20;
	Karyawan []L = new Karyawan[N];
	
	void InitArray() {
		Karyawan R = new Karyawan();
		for (int i=0; i<N; i++) {
			R.NIK = "0";
			R.Nama = "$";
			R.Golongan = 'z';
			R.Gaji = 0;
			L[i] = R;
		}
	}
	
	void InputDataArray() {
		Karyawan R = new Karyawan();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N; i++) {
			R = new Karyawan();
			R.InputData();
			L[i] = R;
		}
	}

	void OutputDataArray() {
		System.out.println("");
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data ke "+i+" adalah");
			L[i].OutputData();
		}
	}
	
	public static void main(String[] args) {
		LarikKaryawan Nas = new LarikKaryawan();
		Scanner sc = new Scanner(System.in);
		
		Nas.InitArray();
		Nas.InputDataArray();
		Nas.OutputDataArray();
	}

}
