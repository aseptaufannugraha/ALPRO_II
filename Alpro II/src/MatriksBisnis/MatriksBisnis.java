package MatriksBisnis;

import java.util.Scanner;

public class MatriksBisnis {
	int M = 2;
	int N = 5;
	Bisnis[][] MB = new Bisnis[M][N];
	
	Scanner sc = new Scanner(System.in);
	
	void InitMatriksBisnis() {
		Bisnis R;
		String X;
		int y = 0, z = 1;
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				R = new Bisnis();
				X = Integer.toString(y);
				if (z>=6) {
					z = 1;
				}
				R.Kode = X;
				R.Nama = "Bisnis"+X;
				R.Jenis = z;
				R.Status = true;
				MB[i][j] = R;
				
				y++; z++;
			}
		}
	}
	
	void InputMatriksBisnis() {
		Bisnis R;
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				R = new Bisnis();
				R.InputBisnis();
				MB[i][j] = R;
			}
		}
	}
	
	void OutputMatriksBisnis() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.println("");
				MB[i][j].OutputBisnis();
			}
		}
	}

	void StatistikMatriksBisnis() {
		int bengkel=0, kafe=0, petshop=0, resto=0, tokosembako=0;
		System.out.println("Menampilkan Statistik");
		for (int i=0; i<M; i++) {
			for (int j = N-3; j<N; j++) {
				switch(MB[i][j].Jenis) {
				case 1:
					bengkel = bengkel+1;
					break;
				case 2:
					kafe = kafe+1;
					break;
				case 3: 
					petshop = petshop+1;
					break;
				case 4:
					resto = resto+1;
					break;
				case 5:
					tokosembako = tokosembako+1;
					break;
						
				}
			}
		}
		
		System.out.println("Jenis Bisnis");
		System.out.println("Bengkel: "+bengkel);
		System.out.println("Kafe: "+kafe);
		System.out.println("Pet shop: "+petshop);
		System.out.println("Resto: "+resto);
		System.out.println("Toko Sembako: "+tokosembako);
	}
	
	void OutputStatistikMatriksBisnis() {
		int bengkel= 0, kafe= 0, petshop= 0, resto= 0, tokosembako= 0;
		System.out.println("Menampilkan Statistik Matriks");
		for (int i=0; i<M; i++) {
			for (int j = N-3; j<N; j++) {
				System.out.print(MB[i][j].Jenis+" ");
			}
		}System.out.println("");
	}
	
	void SeqSearchMatriks(String x) {
		int i=0, j=0;
		Boolean ketemu = false;
		i=0;
		
		while (i<M && ketemu == false) {
			j = 0;
			while (j<N && ketemu == false) {
				if (MB[i][j].Nama.equals(x)) {
					ketemu = true;
				}else {
					j++;
				}
			}
			
			if(ketemu == false) {
				i++;
			}
		}
		
// kalo ketemu
		if(ketemu == true) {
			System.out.println("Ketemu di baris: "+i+" dan kolom: "+j);
		}else {
			System.out.println("Tidak ketemu");
		}
	}

//	int GetElement(int i, int j, int x) {
//		for (int i=0; i<M; i++) {
//			for (int j=0; j<N; j++) {
//				if (MB[i][j].kode.contentEquals(x)) {
//	
//				}
//			}
//		}

//	}
	
//	void SetElement(int i, int j, int x) {
//		Boolean status;
//		Scanner sc = new Scanner(System.in);
//		do {
//			If (x == 1) {
//				status = true;
//			}else {
//				status = false;
//			}
//		}while(x<1 || x>2);
//		MB[i][j].Status = status;
//	}
	
	
	public static void main(String[] args) {
		MatriksBisnis A = new MatriksBisnis(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		
		A.InitMatriksBisnis();
		A.OutputMatriksBisnis();
		A.OutputStatistikMatriksBisnis();
		A.StatistikMatriksBisnis();
		
//		LOOPING CARI NAMA BISNIS
		int i=0;
		do {
			System.out.println("");
			System.out.println("Mencari");
			System.out.println("Nama Bisnis: ");String X = sc.next();
			A.SeqSearchMatriks(X);
			i++;
		}while(i<5);
		System.out.println("Selesai");
	}

}