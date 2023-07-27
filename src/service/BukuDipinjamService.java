package service;

import entity.BukuDipinjam;
import entity.BukuDipinjamInputData;

public interface BukuDipinjamService {
    BukuDipinjam[] getAllBukuDipinjam();

    void addBukuDipinjam(BukuDipinjamInputData inputData);

    boolean removeBukuDipinjam(int bukuDipinjamId);
}
