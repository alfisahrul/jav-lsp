package service;

import entity.BukuDipinjam;
import entity.BukuDipinjamInputData;
import repository.BukuDipinjamRepository;

public class BukuDipinjamServiceImpl implements BukuDipinjamService {
    private BukuDipinjamRepository bukuDipinjamRepository;

    public BukuDipinjamServiceImpl(BukuDipinjamRepository bukuDipinjamRepository) {
        this.bukuDipinjamRepository = bukuDipinjamRepository;
    }

    @Override
    public BukuDipinjam[] getAllBukuDipinjam() {
        return bukuDipinjamRepository.getAllBukuDipinjam();
    }

    @Override
    public void addBukuDipinjam(BukuDipinjamInputData inputData) {
        BukuDipinjam bukuDipinjam = new BukuDipinjam(
                inputData.getId(),
                inputData.getPenulis(),
                inputData.getJudul(),
                inputData.getStok()
        );
        bukuDipinjamRepository.addBukuDipinjam(bukuDipinjam);
    }

    @Override
    public boolean removeBukuDipinjam(int bukuDipinjamId) {
        return bukuDipinjamRepository.removeBukuDipinjam(bukuDipinjamId);
    }
}
