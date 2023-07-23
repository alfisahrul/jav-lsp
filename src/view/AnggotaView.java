package view;

import service.AnggotaService;
import util.InputUtil;
import entity.AnggotaInputData;

import java.util.Scanner;

public class AnggotaView
{
    private AnggotaService anggotaService;

    public AnggotaView(AnggotaService anggotaService)
    {
        this.anggotaService = anggotaService;
    }

    public void showMenuAnggota(){
        while (true) {
            System.out.println("===== MENU Anggota =====");
            System.out.println("1. Tambah Anggota.");
            System.out.println("2. Hapus Anggota.");
            System.out.println("3. Lihat Semua Anggota.");
            System.out.println("0. Kembali ke menu");
            System.out.print("PILIH [0-3]: ");
            var pilihan = InputUtil.input("");

            switch (pilihan) {
                case "1":
                    viewAddAnggota();
                    continue;
                case "2":
                    viewRemoveAnggota();
                    continue;
                case "3":
                    anggotaService.showAnggota();
                    continue;
                case "0":
                    System.out.println("Pindah ke Menu Perpustakaan.");
                    System.out.println();
                    return;

                default:
                    System.out.println("Pilihan tidak dimengerti");
            }


        }
    }

    public void viewAddAnggota() {
        InputUtil.printEqual();
        System.out.println("Tambahkan anggota");

        var batal = InputUtil.input("X Jika batal/ Enter untuk lanjut ");

        if (batal.equals("x")) {

        } else {
            System.out.print("Enter ID: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Enter KTP: ");
            String ktp = scanner.nextLine();

            System.out.print("Enter Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Enter Jenis Kelamin: ");
            String jenisKelamin = scanner.nextLine();

            AnggotaInputData inputData = new AnggotaInputData(id, nama, ktp, alamat, jenisKelamin);
            anggotaService.addAnggota(inputData);
        }

    }


    private void viewRemoveAnggota(){
        anggotaService.showAnggota();
        InputUtil.printEqual();

        System.out.println();
        var number = InputUtil.input("Ketik nomor berapa yang ingin anda hapus tekan (x) Jika batal");
        if(number.equals("x")){

        }else{
            anggotaService.removeAnggota(Integer.valueOf(number));

        }
    }

}
