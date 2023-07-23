package service;

import entity.Anggota;
import entity.Person;
import repository.AnggotaRepository;
import entity.AnggotaInputData;

public class AnggotaServiceImp implements AnggotaService
{
    private AnggotaRepository anggotaRepository;

    public AnggotaServiceImp(AnggotaRepository anggotaRepository)
    {
        this.anggotaRepository = anggotaRepository;
    }

    @Override
    public void showAnggota()
    {
        Anggota[] model = anggotaRepository.getAllAnggota();
        System.out.println("Daftar Anggota");

        for(var i = 0 ; i< model.length; i++){
            var anggota = model[i];
            var no = i + 1;

            if(anggota != null){
                System.out.println(no + ". " + anggota.getId()+ "  " + anggota.getNama()+ "   " + anggota.getKtp() + "   " + anggota.getAlamat()+ "  "+ anggota.getJenisKelamin());
            }
        }

    }

    @Override
    public void addAnggota(AnggotaInputData inputData)
    {
        Anggota anggota = new Anggota(inputData.getId(),
                                      inputData.getNama(),
                                      inputData.getKtp(),
                                      inputData.getAlamat(),
                                      inputData.getJenisKelamin());
        anggotaRepository.add(anggota);
        System.out.println("Sukses menambah anggota : " + anggota.getNama() );
    }

    @Override
    public void removeAnggota(Integer number)
    {
        boolean success = anggotaRepository.remove(number);
        if(success) {
            System.out.println("Sukses menghapus" + number);
        }else {
            System.out.println("GAGAL MENGHAPUS" + number);
        }
    }

    @Override
    public void editAnggota(String anggota)
    {

    }
}
