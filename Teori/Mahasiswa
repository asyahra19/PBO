import java.util.Scanner;

public class Mahasiswa {
    String nim, nama, jenisKelamin, alamat;

    public static void main(String[] args) {
        Mahasiswa dataMahasiswa = new Mahasiswa();

        Scanner input = new Scanner(System.in);

        System.out.println("-------Input Data Mahasiswa-------");
        System.out.println("----------------------------------");

        System.out.print("NIM             : ");
        String nim = input.nextLine();

        System.out.print("Nama            : ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin   : ");
        String jenisKelamin = input.nextLine();

        System.out.print("ALamat          : ");
        String alamat = input.nextLine();

        input.close();

        dataMahasiswa.isiData(nim, nama, jenisKelamin, alamat);
        dataMahasiswa.printData();

    }

    public void isiData(String nim, String nama, String jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public void printData() {
        System.out.println("----------------------------------");
        System.out.println("==========DATA MAHASISWA==========");
        System.out.println("NIM             : " + this.nim );
        System.out.println("NAMA            : " + this.nama);
        System.out.println("JENIS KELAMIN   : " + this.jenisKelamin);
        System.out.println("ALAMAT          : " + this.alamat);
    }
}
