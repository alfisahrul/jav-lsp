package test.service;

import entity.BukuInputData;
import repository.BukuRepository;
import repository.BukuRepositoryImpl;
import service.BukuService;
import service.BukuServiceImpl;

public class BukuServiceTest
{
    public static void main(String[] args)
    {
        testAddBuku();
    }

    public static void testShowBuku(){
        BukuRepository bukuRepository = new BukuRepositoryImpl();

        BukuService bukuService = new BukuServiceImpl(bukuRepository);

        bukuService.showBuku();


    }

    public static void testAddBuku(){
        BukuRepository bukuRepository = new BukuRepositoryImpl();

        BukuService bukuService = new BukuServiceImpl(bukuRepository);

        bukuService.addBuku(new BukuInputData(111,"dasdas","dsadasd",1,2));
        bukuService.addBuku(new BukuInputData(111,"dasdas","dsadasd",1,2));
        bukuService.addBuku(new BukuInputData(111,"dasdas","dsadasd",1,2));
        bukuService.addBuku(new BukuInputData(111,"dasdas","dsadasd",1,2));
        bukuService.showBuku();
    }
}
