package repository;

import entity.Perpustakaan;

public interface PerpustakaanRepository
{
    Perpustakaan[] getAll();

    void add (Perpustakaan perpustakaan);


}
