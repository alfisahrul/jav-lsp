package repository;

import entity.Perpustakaan;

public class PerpustakaanRepositoryImpl implements PerpustakaanRepository
{
    public Perpustakaan[] data = new Perpustakaan[10];
    @Override
    public Perpustakaan[] getAll()
    {
        return data;
    }

    @Override
    public void add(Perpustakaan perpustakaan)
    {

    }
}
