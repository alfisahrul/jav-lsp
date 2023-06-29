package test;

import entity.Perpustakaan;
import repository.PerpustakaanRepository;
import repository.PerpustakaanRepositoryImpl;
import service.PerpustakaanService;
import service.PerpustakaanServiceImp;

public class PerpusServiceTest
{
    public static void main(String[] args)
    {
        testShowPerpustakaan();
    }

    public static void testShowPerpustakaan()
    {
        PerpustakaanRepositoryImpl perpustakaanRepository = new PerpustakaanRepositoryImpl();
        perpustakaanRepository.data[0] =  new Perpustakaan("hallo");
        PerpustakaanService perpustakaanService = new PerpustakaanServiceImp(perpustakaanRepository);

        perpustakaanService.showPerpustakaan();
    }

}

