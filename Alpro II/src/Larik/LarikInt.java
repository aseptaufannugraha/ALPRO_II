package Larik;

import java.util.Scanner;

public class LarikInt {

	public static void main(String[] args) {
		int N = 3;
		int[] A = new int[N];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			A[i] = 0;
		}
		
		System.out.println("Menginput element-element array");
		for (int i=0; i<N; i++) {
			System.out.print("Data ke "+i+": ");A[i]=sc.nextInt();
		}
		
		System.out.println("Menampilkan isi/elemen array");
        for (int i=0; i<N; i++) {
            System.out.println("data ke "+i+" adalah "+A[i]);
        }
        
        int Total=0;
        for (int i=0; i<N;i++) {
            Total=Total + A[i];
        }
        double Rata=(double)Total/N;
        System.out.println("Rata-rata adalah "+ Rata);

	}

}
