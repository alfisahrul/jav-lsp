package repository;
import entity.Anggota;
public interface  AnggotaRepository
{
    Anggota[] getAllAnggota();

    void add(Anggota anggota);

    boolean remove(Integer number);

    void edit(Anggota anggota);

}
