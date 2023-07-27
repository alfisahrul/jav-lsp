package view;

import entity.BukuDipinjam;
import service.BukuDipinjamService;

import java.util.Scanner;

public class BukuDipinjamView {
    private BukuDipinjamService bukuDipinjamService;
    private Scanner scanner;

    public BukuDipinjamView(BukuDipinjamService bukuDipinjamService) {
        this.bukuDipinjamService = bukuDipinjamService;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=== Peminjaman Buku  ===");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Show All Buku Dipinjam");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading the integer input

                switch (choice) {
                    case 1:
                        pinjamBuku();
                        break;
                    case 2:
                        showAllBukuDipinjam();
                        break;
                    case 0:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private void pinjamBuku() {
        System.out.println("\n=== Pinjam Buku ===");

        System.out.println("\n=== Pinjam Buku ===");
        System.out.print("Enter the ID of the Buku to borrow: ");
        int bukuId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer input

        bukuDipinjamService.pinjamBuku(bukuId);
    }

    private void showAllBukuDipinjam() {
        System.out.println("\n=== All Buku Dipinjam ===");
        BukuDipinjam[] bukuDipinjams = bukuDipinjamService.getAllBukuDipinjam();
        for (BukuDipinjam bukuDipinjam : bukuDipinjams) {
            System.out.println(bukuDipinjam);
        }
    }
}
