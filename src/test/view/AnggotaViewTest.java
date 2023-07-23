package test.view;

import repository.AnggotaRepository;
import repository.AnggotaRepositoryImpl;
import service.AnggotaService;
import service.AnggotaServiceImp;
import view.AnggotaView;

public class AnggotaViewTest
{
    public static void main(String[] args)
    {
        testRemoveMenuAnggota();
    }

    public static void  testShowMenuAnggota(){
        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);
        AnggotaView anggotaView = new AnggotaView(anggotaService);

        anggotaView.showMenuAnggota();
    }

    public static void  testRemoveMenuAnggota(){
        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);
        AnggotaView anggotaView = new AnggotaView(anggotaService);

        anggotaView.showMenuAnggota();
    }
}
