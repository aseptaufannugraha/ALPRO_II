package SequentialFile;

import java.io.*;

public class BuatArsipMahasiswa {
    public static void main(String[] args) {
        File arsMhs = new File("ArsMhs.dat");
        DataMhs mhs = new DataMhs();
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(arsMhs);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Masukkan NIM: ");
            mhs.NIM = Integer.parseInt(bufferedReader.readLine());
            
            while (mhs.NIM != 9999) {
                System.out.print("Masukkan Nama: ");
                mhs.Nama = bufferedReader.readLine();
                
                System.out.print("Masukkan IP: ");
                mhs.IP = Double.parseDouble(bufferedReader.readLine());
                
                objectOutputStream.writeObject(mhs);
                
                System.out.print("Masukkan NIM: ");
                mhs.NIM = Integer.parseInt(bufferedReader.readLine());
            }
            
            objectOutputStream.close();
            
            System.out.println("Arsip berhasil dibuat.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void run() {
        File arsMhs = new File("ArsMhs.dat");
        DataMhs mhs = new DataMhs();
        
        try {
            FileInputStream fileInputStream = new FileInputStream(arsMhs);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            
            System.out.println("Daftar Mahasiswa:");
            
            while (true) {
                try {
                    mhs = (DataMhs) objectInputStream.readObject();
                    System.out.println("NIM: " + mhs.NIM);
                    System.out.println("Nama: " + mhs.Nama);
                    System.out.println("IP: " + mhs.IP);
                    System.out.println("-------------------------");
                } catch (EOFException e) {
                    break; // Keluar dari loop saat EOF (end of file) tercapai
                }
            }
            
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class DataMhs implements Serializable {
    public int NIM;
    public String Nama;
    public double IP;
}

