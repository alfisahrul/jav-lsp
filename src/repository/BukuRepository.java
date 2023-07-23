package repository;
import entity.Buku;
public interface BukuRepository
{
    Buku[] getAllBuku();

    void add(Buku buku);

    boolean remove(Integer number);

    void edit(Buku buku);

    Buku findBukuById(int id);



}
