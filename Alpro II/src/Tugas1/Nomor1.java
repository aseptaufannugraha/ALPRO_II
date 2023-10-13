package Tugas1;

import java.util.Scanner;

public class Nomor1 {
//	membuat function
	int N=5;
	int []a=new int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			a[i]=0;
		}
	}
	
	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N; i++) {
			System.out.print("Data ke-"+(i+1)+":");a[i]=sc.nextInt();
		}
	}
	
	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data ke "+(i+1)+" adalah "+a[i]);
		}
	}
	
	int CariElement(int x) {
		int index = -1;
	       for (int i=0; i<N; i++)
	       {
	        if(a[i]==x) {
	    		index = i;
	        }
	       }
	       return index;
	}
	
	int search(int x) {
		int index=-1;
 		int i=0;
	
 	while((i<N-1)&&(a[i] != x)) {
		i++;
	}
	
	if(a[i]==x) {
		index = i;
	}
	
	return index;
  }	
	
	public static void main(String[] args) {
		Nomor1 A=new Nomor1();
		Scanner sc = new Scanner(System.in);

		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value :");int k=sc.nextInt();
		if(A.CariElement(k)>0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.CariElement(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
	}

}
