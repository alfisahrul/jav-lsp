import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" Menu Utama");
            System.out.println(PrintEqual());
            System.out.println("1. Keanggotaan \n" +
                    "2. Manajemen Buku\n"+
                    "3. Peminjaman Buku\n" +
                    "0. Keluar\n");
            System.out.println(PrintEqual());
            System.out.print("Masukan pilihan: "
            );
            int pil = sc.nextInt();

            switch (pil){
                case 1:
                    Anggota.main(args);
                    break;

                case 2:
                    Buku.main(args);
                    break;

                case 3:
                    BukuDipinjam.main(args);
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan aplikasi ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan pilihan yang sesuai");
            }


        }while (true);
    }

    public static String PrintEqual() {
        for (int i = 0 ; i<=20;i++){
            System.out.print("=");
        }
        return"=";
    }



}