package repository;
import entity.Buku;
public interface BukuRepository
{
    Buku[] getAllBuku();

    void add(Buku buku);

    void remove(Buku buku);

    void edit(Buku buku);




}
