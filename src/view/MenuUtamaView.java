package view;

import service.AnggotaService;
import util.InputUtil;

public class MenuUtamaView
{
    public void showMenuUtamaPerpustakaan()
    {

        while (true){
            System.out.println(" Menu Utama");
            InputUtil.printEqual();
            System.out.println("===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Menu Buku");
            System.out.println("2. Menu Anggota");
            System.out.println("3. Menu Peminjaman");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih [0-3]: ");

            InputUtil.printEqual();
            // Memasukan pilihan yang sesuai dengan kondisi
            var pilihan = InputUtil.input("Masukan Pilihan anda ");
            switch (pilihan){
                case "1":

                    break;

                case "2":

                    break;

                case "3":

                    break;
                case "0":
                    System.out.println("Terimakasih telah menggunakan aplikasi ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan pilihan yang sesuai");
            }

        }

    }
}
