import java.util.Scanner;
public class Pemilihan2Tugas18 {
    public static void main(String[] args) {
            Scanner sc18 = new Scanner(System.in);
            double harga = 20000;
            double diskon;
            System.out.print("Masukan Jenis Buku:  ");
            String jenisBuku = sc18.nextLine();
            System.out.print("Masukan Jumlah Buku: ");
            int jumlahBuku = sc18.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon =+ 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }
        double totalHargaSebelumDiskon = harga * jumlahBuku;
        double totalDiskon = totalHargaSebelumDiskon * diskon;
        double totalHargaBayar = totalHargaSebelumDiskon - diskon;

        System.out.println("Total diskon: Rp " + (int) totalDiskon);
        System.out.println("Total harga yang harus dibayar: Rp " + (int) totalHargaBayar);
    }
}
