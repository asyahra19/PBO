import javax.swing.JWindow;

public class Mahasiswa_1 {
    String nim, nama, alamat;
    char jenisKelamin;

    Mahasiswa_1(String nim, String nama, char jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void cetakData() {
        System.out.println("-----------DATA MAHASISWA-----------");
        System.out.println("Nama                : " + nama);
        System.out.println("NIM                 : " + nim);
        System.out.println("Jenis Kelamin       : " + jenisKelamin);
        System.out.println("Alamat              : " + alamat);
    }
    public static void main(String[] args) {
        Mahasiswa_1 mhs = new Mahasiswa_1("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.cetakData();
    }
}
