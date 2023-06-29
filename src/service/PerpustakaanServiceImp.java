package service;

import repository.PerpustakaanRepository;

public class PerpustakaanServiceImp implements PerpustakaanService
{
    private PerpustakaanRepository perpustakaanRepository;

    public PerpustakaanServiceImp(PerpustakaanRepository perpustakaanRepository)
    {
        this.perpustakaanRepository = perpustakaanRepository;
    }

    @Override
    public void showPerpustakaan()
    {
        System.out.println("MANAJEMEN PERPUSTAKAAN");
    }
}
