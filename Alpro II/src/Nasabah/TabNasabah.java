package Nasabah;

import java.util.Scanner;

public class TabNasabah {
	int N=1;
	Nasabah []a=new Nasabah[N];
	
	void InitArray() {
		Nasabah R=new Nasabah();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NoRek="0";
			R.Nama="$";
			R.Saldo=4;
			R.Password="***";
			a[i]=R;
		}
	}
	
	void InputArray() {
		Nasabah R=new Nasabah();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N;i++) {
			R=new Nasabah();
			R.BacaNasabah();
			a[i]=R;
		}
	}
	
	void TampilArray() {
		System.out.print("");
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
//			System.out.println("Data ke "+i+" adalah "+a[i].NIM+","+a[i].Nama+","+a[i].IPK);
			System.out.print("Data ke "+i+"  adalah ");
			a[i].TulisNasabah();
		}
	}
	
	void Login() {
		int i=0;
		System.out.println("Login ....");
		Scanner sc= new Scanner(System.in);
		System.out.print("Norek anda ");String id=sc.next();
		System.out.print("Pin anda ke ");String Pass=sc.next();
		
		while ((i<N-1) && (!a[i].NoRek.contentEquals(id))) {
			i++;
		}
		if (a[i].NoRek.equals(id)) {
			if (a[i].Password.equals(Pass)) {
				a[i].TulisNasabah();
				System.out.print("Silahkan masuk ");
			}
			else {
				System.out.print("Password Anda salah ");
			}
		}else 
				System.out.print("Anda bukan nasabah ");
	}

	int CariElement(String x) {
		int index=-1;
	       for (int i = 0; i < N; i++)
	       {
	        if(a[i].NoRek.equals(x)==true) {
	    		index= i;
	        }
	       }
	       return index;
	}
	
//	tipe recordnya TabMahasiswa
	Nasabah GetElement(int i) {
		return a[i];
	}
	
	void SetElement(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Data index ke-"+i+":");
	}

//	Main Program dibawah ini
	public static void main(String[] args) {
		TabNasabah Nas=new TabNasabah();
		Scanner sc= new Scanner(System.in);
		
		Nas.InitArray();
		Nas.TampilArray();
		Nas.InputArray();
		Nas.TampilArray();
		Nas.Login();
		System.out.println("");
		System.out.print("Cari NoRek bernilai : ");
		String x = sc.next();
		int k = 0;
		k = Nas.CariElement(x);
		if(k!=-1) {
			System.out.println("NoRek "+ x + " ke temu di index ke: "+k);
			Nasabah R= new Nasabah();
			R=Nas.GetElement(k); R.TulisNasabah();
		}else {
			System.out.print("NoRek "+ x + " tidak ada di dalam larik");
		}
	}
			
}
