import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");

        double totalBeli = sc.nextInt();
        double diskon;

        if(totalBeli < 50000){
            diskon = 0;
            System.out.println("anda tidak mendapat diskon");
        }else if(totalBeli >= 50000 && totalBeli < 75000){
            diskon = 0.05;
            System.out.println("anda mendapat diskon 5%");
        }else if(totalBeli >= 75000 && totalBeli < 125000){
            diskon = 0.15;
            System.out.println("anda mendapat diskon 15%");
        }else{
            diskon = 0.20;
            System.out.println("anda mendapat diskon 20%");
        }
        
        double totalBayar = (totalBeli - (diskon*totalBeli));
        System.out.println("Total : " + totalBayar);

        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
    }
}