package Tugas1;

import java.util.Scanner;

public class Nomor3 {
//	membuat function
	int N=5;
	int []a=new int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			a[i]=0;
		}
	}
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N;i++) {
			System.out.print("Data ke-"+(i+1)+":");a[i]=sc.nextInt();
		}
	}
	
	void TampilArray() {
		for(int i = 0; i< 2;i++ ) {
			System.out.println("Data ke-"+(i+1)+": "+a[i]);
		}
	}
	
	void DuaTerbesar() {
	    for ( int i = 0; i < a.length; i ++ ) {
	        for ( int j = 0; j < a.length - 1 ; j ++ ) {
	            if ( a[ j ] < a[ j + 1 ] ) {
	                int temp = a[ j ];
	                a[ j ] = a[ j + 1 ];
	                a[ j + 1 ] = temp ;
	            }
	        }
	    }
	}
	
	
//	isi eksekusi
	public static void main(String[] args) {
		Nomor3 A=new Nomor3();
		Scanner sc = new Scanner(System.in);

		A.InitArray();
		A.InputArray();
		
		//menggunakan Bubble Sort
		A.DuaTerbesar(); // sorting kecil ke kebesar
		System.out.println("");
		System.out.println("Data terbesar 1 dan 2:");
		A.TampilArray();
	}

}
