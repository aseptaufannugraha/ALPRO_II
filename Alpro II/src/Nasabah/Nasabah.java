package Nasabah;

import java.util.Scanner;

public class Nasabah {
	String NoRek;
	String Nama;
	String Password;
	float Saldo;

	void BacaNasabah() {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("NoRek (string): ");NoRek=sc.next();
		System.out.print("Nama (string): ");Nama=sc.next();
		System.out.print("Password (string): ");Password=sc.next();
		System.out.print("Saldo (real): ");Saldo=sc.nextFloat();
	}
	
	void TulisNasabah() {
		System.out.println("("+NoRek+", "+Nama+", "+Saldo+", "+Password+")");
	}
	
	void TampilNasabah() {
		System.out.println("NoRek: "+NoRek);
		System.out.println("Nama: "+Nama);
		System.out.println("Saldo: "+Saldo);
		System.out.println("Password: "+Password);
	}
	
	public static void main(String[] args) {
		Nasabah S=new Nasabah();
		S.BacaNasabah();
		S.TulisNasabah();
	
	}
}
