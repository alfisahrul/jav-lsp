import java.util.Scanner;

public class PerpusApp {
    //Menambahkan variabel sc untuk user memasukan Input dari keyboard
    public static  java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        showMenuUtama();


    }

    public static void showMenuUtama(){
        //Menampilkan menu utama pada program utama
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

            // Memasukan pilihan yang sesuai dengan kondisi
            int pil = sc.nextInt();

            switch (pil){
                case 1:
                    
                    break;

                case 2:

                    break;

                case 3:

                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan aplikasi ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan pilihan yang sesuai");
            }
            sc.close();

        }while (true);

    }
    // Method untuk membuat garis
    public static String PrintEqual() {
        for (int i = 0 ; i<20;i++){
            System.out.print("=");
        }
        return"=";
    }





}