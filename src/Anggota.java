import java.util.Scanner;
public class Anggota {


    public static void main(String[] args) {


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Menu Keanggotaan");
            System.out.println(Main.PrintEqual());
            System.out.println("1. Tambah Anggota \n" +
                    "2. Hapus Member\n"+
                    "3. Tampilkan Semua Member\n" +
                    "0. Kembali ke Menu Utama\n");
            System.out.println(Main.PrintEqual());
            System.out.print("Masukan pilihan: "
            );
            int pil = sc.nextInt();

            switch (pil){
                case 1:
                    TambahMember();
                    break;

                case 2:
                    HapusMember();
                    break;

                case 3:
                    TampilkanMember();
                    break;
                case 0:
                    Main.main(args);
                    break;
                default:
                    System.out.println("Masukan pilihan yang sesuai");
            }


        }while (true);

    }
    public static void TambahMember(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(Main.PrintEqual());
            int id = sc.nextInt();
            sc.nextLine();


        }while (true);


    }
    public static void HapusMember(){

    }

    public static void TampilkanMember(){

    }

    public  Anggota (){


    }

    public void printInfoBuku() {

    }

}


