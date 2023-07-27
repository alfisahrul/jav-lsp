package repository;

import entity.BukuDipinjam;

public interface BukuDipinjamRepository
{

    BukuDipinjam[] getAllBukuDipinjam();
    void addBukuDipinjam(BukuDipinjam bukuDipinjam);

    boolean removeBukuDipinjam(int bukuDipinjamId);


    BukuDipinjam findBukuDipinjamById(int id);

}
