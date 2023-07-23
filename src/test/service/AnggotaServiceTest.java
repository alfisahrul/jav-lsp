package test.service;

import entity.Anggota;
import entity.AnggotaInputData;
import repository.AnggotaRepository;
import repository.AnggotaRepositoryImpl;
import service.AnggotaService;
import service.AnggotaServiceImp;

public class AnggotaServiceTest
{
    public static void main(String[] args)
    {
       testRemoveAnggota();

    }

    public static void testShowAnggota(){
        AnggotaRepositoryImpl anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);



        anggotaService.showAnggota();


    }

    public static void testAddAnggota(){
        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);

        anggotaService.addAnggota(new AnggotaInputData(222,"budi","A02","Jl tekukur", "LAKI LAKI"));

        anggotaService.showAnggota();
    }

    public static void testRemoveAnggota(){


        AnggotaRepository anggotaRepository = new AnggotaRepositoryImpl();
        AnggotaService anggotaService = new AnggotaServiceImp(anggotaRepository);



        anggotaService.addAnggota(new AnggotaInputData(111,"cokro","A02","Jl tekukur", "LAKI LAKI"));
        anggotaService.addAnggota(new AnggotaInputData(222,"cokro","A02","Jl tekukur", "LAKI LAKI"));
        anggotaService.addAnggota(new AnggotaInputData(222,"cokro","A02","Jl tekukur", "LAKI LAKI"));

        anggotaService.showAnggota();

        anggotaService.removeAnggota(2);

        anggotaService.removeAnggota(5);

        anggotaService.showAnggota();
    }
}
