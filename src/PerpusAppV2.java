import repository.*;
import service.*;
import util.InputUtil;
import view.AnggotaView;
import view.BukuDipinjamView;
import view.BukuView;

public class PerpusAppV2
{
    public static void main(String[] args)
    {
        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);
        AnggotaView anggotaView = new AnggotaView(anggotaService);
        BukuRepository bukuRepository = new BukuRepositoryImpl();
        BukuService bukuService = new BukuServiceImpl(bukuRepository);
        BukuView bukuView = new BukuView(bukuService);
        BukuDipinjamRepository bukuDipinjamRepository = new BukuDipinjamRepositoryImpl();
        BukuDipinjamService bukuDipinjamService = new BukuDipinjamServiceImpl(bukuDipinjamRepository);
        BukuDipinjamView bukuDipinjamView = new BukuDipinjamView(bukuDipinjamService);


        while (true){

            System.out.println("===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Menu Buku");
            System.out.println("2. Menu Anggota");
            System.out.println("3. Menu Peminjaman");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih [0-3]: ");


            // Memasukan pilihan yang sesuai dengan kondisi
            var pilihan = InputUtil.input("Masukan Pilihan anda ");
            switch (pilihan){
                case "1":
                    bukuView.showMenuBuku();
                    break;

                case "2":
                    anggotaView.showMenuAnggota();
                    break;

                case "3":
                    bukuDipinjamView.showMenu();
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
