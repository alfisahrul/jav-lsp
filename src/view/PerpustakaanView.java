package view;

import util.InputUtil;

import static util.InputUtil.input;
import static util.InputUtil.printEqual;

public class PerpustakaanView
{
    public void showPerpustakaan()
    {

        do {
            System.out.println(" Menu Utama");
            InputUtil.printEqual();
            System.out.println("1. Keanggotaan \n" +
                                       "2. Manajemen Buku\n"+
                                       "3. Peminjaman Buku\n" +
                                       "0. Keluar\n");

            InputUtil.printEqual();
            // Memasukan pilihan yang sesuai dengan kondisi
            var pilihan = InputUtil.input("Masukan Pilihan anda ");
            switch (pilihan){
                case "1":
                    showAnggota();
                    break;

                case "2":
                    showBuku();
                    break;

                case "3":
                    showPeminjamanBuku();
                    break;
                case "0":
                    System.out.println("Terimakasih telah menggunakan aplikasi ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan pilihan yang sesuai");
            }

        }while (true);

    }



    public void showBuku()
    {
        while (true) {
            System.out.println("===== MENU BUKU =====");
            System.out.println("1. Tambah Buku.");
            System.out.println("2. Edit Buku.");
            System.out.println("3. Hapus Buku.");
            System.out.println("4. Lihat Semua Buku.");
            System.out.println("0. Kembali ke menu");
            System.out.print("PILIH [0-4]: ");
            var pilihan = InputUtil.input("");
            switch (pilihan.strip()) {
                case "1":
                    showTambahBuku();
                    System.out.println();
                    break;
                case "2":
                    showEditBuku();
                    System.out.println();
                    break;
                case "3":
                    deleteBuku();
                    System.out.println();
                    break;
                case "4":
                    listSemuaBuku();
                    System.out.println();
                    break;
                case "0":
                    System.out.println("Pindah ke Menu Perpustakaan.");
                    System.out.println();
                    return;
                default:
                    System.out.println("Silahkan pilih dari angka [0-4]");
                    System.out.println();
            }
        }


    }

    public void showAnggota()
    {
        while (true) {
            System.out.println("===== MENU BUKU =====");
            System.out.println("1. Tambah Anggota.");
            System.out.println("2. Hapus Anggota.");
            System.out.println("3. Lihat Semua Anggota.");
            System.out.println("0. Kembali ke menu");
            System.out.print("PILIH [0-3]: ");
            var pilihan = InputUtil.input("");

            switch (pilihan.strip()) {
                case "1":
                    showTambahAnggota();
                    continue;
                case "2":
                    this.removeAnggota();
                    continue;
                case "3":
                    listSemuaAnggota();
                    continue;
                case "0":
                    System.out.println("Pindah ke Menu Perpustakaan.");
                    System.out.println();
                    return;
            }

        }

    }

    public void showPeminjamanBuku()
    {
        while (true) {
            System.out.println("===== MENU BUKU =====");
            System.out.println("1. Pinjam Buku.");
            System.out.println("2. Lihat semua peminjam.");
            System.out.println("0. Kembali ke menu");
            System.out.print("PILIH [0-1]: ");


            switch (pilihan.strip()) {
                case "1":
                    pinjamBuku();
                    continue;
                case "2":
                    lihatPeminjam();
                    continue;
                case "0":
                    System.out.println("Pindah ke Menu Perpustakaan.");
                    System.out.println();
                    return;
            }

        }

    }




}
