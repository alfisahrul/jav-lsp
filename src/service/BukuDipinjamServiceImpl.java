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
    @Override
    public BukuDipinjam findBukuDipinjamById(int bukuDipinjamId) {
        return bukuDipinjamRepository.findBukuDipinjamById(bukuDipinjamId);
    }



    @Override
    public void pinjamBuku(int bukuDipinjamId) {
        BukuDipinjam bukuDipinjam = bukuDipinjamRepository.findBukuDipinjamById(bukuDipinjamId);
        if (bukuDipinjam != null) {
            if (bukuDipinjam.getStok() > 0 && bukuDipinjam.getDipinjam() < bukuDipinjam.getStok()) {
                bukuDipinjam.decreaseStok();
                bukuDipinjam.increaseDipinjam();
                System.out.println("BukuDipinjam dengan ID " + bukuDipinjamId + " berhasil dipinjam.");
            } else {
                System.out.println("BukuDipinjam dengan ID " + bukuDipinjamId + " tidak tersedia untuk dipinjam.");
            }
        } else {
            System.out.println("BukuDipinjam dengan ID " + bukuDipinjamId + " tidak ditemukan.");
        }
    }

}
