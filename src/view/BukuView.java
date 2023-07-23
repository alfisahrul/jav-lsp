package view;

import service.BukuService;
import util.InputUtil;
import entity.BukuInputData;

import java.util.Scanner;

public class BukuView
{

    private BukuService bukuService;

    public BukuView(BukuService bukuService){
        this.bukuService = bukuService;
    }
    public void showMenuBuku()
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
            switch (pilihan) {
                case "1":
                    showAddBuku();
                    System.out.println();
                    break;
                case "2":
                    showEditBuku();
                    System.out.println();
                    break;
                case "3":
                    showRemoveBuku();
                    System.out.println();
                    break;
                case "4":
                    bukuService.showBuku();
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
    public void showAddBuku()
    {
        InputUtil.printEqual();
        System.out.println("Tambahkan anggota");

        var batal = InputUtil.input("X Jika batal/ Enter untuk lanjut ");

        if (batal.equals("x")) {

        } else {
            System.out.println("Tambah Buku");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Penulis: ");
            String penulis = scanner.nextLine();

            System.out.print("Enter Judul: ");
            String judul = scanner.nextLine();

            System.out.print("Enter Stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Dipinjam: ");
            int dipinjam = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            BukuInputData inputData = new BukuInputData(id, penulis, judul, stok, dipinjam);
            bukuService.addBuku(inputData);
            System.out.println("Sukses menambah buku.");
        }
    }

    public void showRemoveBuku()
    {
        bukuService.showBuku();
        InputUtil.printEqual();

        System.out.println();
        var number = InputUtil.input("Ketik nomor berapa yang ingin anda hapus tekan (x) Jika batal");
        if(number.equals("x")){

        }else{
            bukuService.removeBuku(Integer.valueOf(number));

        }
    }

    public void showEditBuku()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit Buku");

        System.out.print("Enter ID Buku: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Check if the book exists in the repository
        if (bukuService.findBukuById(id) != null) {
            System.out.println("Buku found. Please provide updated details.");

            System.out.print("Enter Penulis: ");
            String penulis = scanner.nextLine();

            System.out.print("Enter Judul: ");
            String judul = scanner.nextLine();

            System.out.print("Enter Stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Dipinjam: ");
            int dipinjam = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            BukuInputData inputData = new BukuInputData(id, penulis, judul, stok, dipinjam);
            bukuService.editBuku(inputData);
        } else {
            System.out.println("Buku dengan ID " + id + " tidak ditemukan. Edit gagal.");
        }
    }


}

