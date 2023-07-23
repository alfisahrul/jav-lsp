import repository.AnggotaRepository;
import repository.AnggotaRepositoryImpl;
import service.AnggotaService;
import service.AnggotaServiceImp;
import util.InputUtil;
import view.AnggotaView;

public class PerpusAppV2
{
    public static void main(String[] args)
    {
        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);
        AnggotaView anggotaView = new AnggotaView(anggotaService);


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

                    break;

                case "2":
                    anggotaView.showMenuAnggota();
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
