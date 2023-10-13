package Searching;

import java.util.Scanner;

public class SequensialSearch {
//	membuat function
	int N=5;
	int []A=new int[N];
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			A[i]=0;
		}
	}

	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N; i++) {
			System.out.print("Data ke-"+(i)+":");A[i]=sc.nextInt();
		}
	}
	
	void InputArrayManual() {
		A[0]=15;
		A[1]=13;
		A[2]=11;
		A[3]=9;
		A[4]=7;
	}


	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N; i++) {
			System.out.println("Data ke "+(i)+" adalah "+A[i]);
		}
	}
	
	int CariElement(int x) {
		int index=-1;
	       for (int i=0; i<N; i++)
	       {
	        if(A[i]==x) {
	    		index= i;
	        }
	       }
	       return index;
	}
	
	int search(int x) {
 		int index=-1;
 		int i=0;
	
 	while((i<N-1)&&(A[i] != x)){
		i++;
	}
	
	if(A[i]==x) {
		index=i;
	}
	
	return index;
  }
	
	int SeqSearch(int x) {
	 int i=0;
	 
	 while((i<N-1)&&(A[i]>x)) {
	 		i++;
	 }
	 
	 if(A[i]==x) {
		 return i;
	 }else {
		 return -1;
	 }
	}

	public static void main(String[] args) {
		SequensialSearch A=new SequensialSearch();
		Scanner sc = new Scanner(System.in);

		A.InitArray();
		A.InputArrayManual();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value :");int k=sc.nextInt();
		if(A.SeqSearch(k)>=0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.SeqSearch(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
		
	}

}
