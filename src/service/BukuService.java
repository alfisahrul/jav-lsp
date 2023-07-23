package service;
import entity.BukuInputData;
import entity.Buku;
public interface BukuService
{
    void showBuku();

    void addBuku(BukuInputData inputData);

    void removeBuku(Integer number);

    void editBuku(BukuInputData inputData);

    Buku findBukuById(int id);
}
