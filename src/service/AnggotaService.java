package service;
import entity.AnggotaInputData;

public interface AnggotaService
{
    void showAnggota();

    void addAnggota(AnggotaInputData inputData );

    void removeAnggota(Integer number);

    void editAnggota(String anggota);

}
