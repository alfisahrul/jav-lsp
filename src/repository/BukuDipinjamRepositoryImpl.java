package repository;

import entity.BukuDipinjam;

public class BukuDipinjamRepositoryImpl implements BukuDipinjamRepository {
    private BukuDipinjam[] data = new BukuDipinjam[10];
    private int counter = 0;

    @Override
    public BukuDipinjam[] getAllBukuDipinjam() {
        return data;
    }

    @Override
    public void addBukuDipinjam(BukuDipinjam bukuDipinjam) {
        if (counter < data.length) {
            data[counter] = bukuDipinjam;
            counter++;
        }
    }

    @Override
    public boolean removeBukuDipinjam(int bukuDipinjamId) {
        for (int i = 0; i < counter; i++) {
            if (data[i].getId() == bukuDipinjamId) {
                // Shift elements to remove the book
                for (int j = i; j < counter - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[counter - 1] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

        @Override
    public BukuDipinjam findBukuDipinjamById(int id) {
        for (int i = 0; i < counter; i++) {
            if (data[i].getId() == id) {
                return data[i];
            }
        }
        return null;
    }

}
