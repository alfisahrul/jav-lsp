package service;
import entity.Buku;
import repository.BukuRepository;
import entity.BukuInputData;
public class BukuServiceImpl implements BukuService
{


    private BukuRepository bukuRepository;

    public BukuServiceImpl(BukuRepository bukuRepository)
    {
        this.bukuRepository = bukuRepository;
    }
    @Override
    public void showBuku()
    {
        Buku[] model = bukuRepository.getAllBuku();
        System.out.println("Daftar Buku");

        for(var i = 0 ; i< model.length; i++){
            var buku = model[i];
            var no = i + 1;

            if(buku != null){
                System.out.println(no + ". " + buku.getId()+"  "+
                                           buku.getJudul()+"  "+
                                           buku.getPenulis()+"  "+
                                           buku.getStok()+"  ");
            }
        }

    }

    @Override
    public void addBuku(BukuInputData inputData)
    {
        Buku buku = new Buku(inputData.getId(),
                             inputData.getJudul(),
                             inputData.getPenulis(),
                             inputData.getStok()

        );
        bukuRepository.add(buku);
        System.out.println("Sukses menambah buku : " + buku.getJudul());

    }

    @Override
    public void removeBuku(Integer number)
    {
        boolean success = bukuRepository.remove(number);
        if(success) {
            System.out.println("Sukses menghapus" + number);
        }else {
            System.out.println("GAGAL MENGHAPUS" + number);
        }
    }
    public Buku findBukuById(int id) {
        return bukuRepository.findBukuById(id);
    }



    @Override
    public void editBuku(BukuInputData inputData)
    {
        Buku existingBuku = bukuRepository.findBukuById(inputData.getId());

        if (existingBuku != null)
        {
            // Update the existingBuku object with the new information
            existingBuku.setPenulis(inputData.getPenulis());
            existingBuku.setJudul(inputData.getJudul());
            existingBuku.setStok(inputData.getStok());

            bukuRepository.edit(existingBuku);
            System.out.println("Sukses mengedit buku dengan ID: " + inputData.getId());
        } else
        {
            System.out.println("Buku dengan ID " + inputData.getId() + " tidak ditemukan. Edit gagal.");

        }
    }
}