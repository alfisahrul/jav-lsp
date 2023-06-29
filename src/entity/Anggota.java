package entity;

public class Anggota extends Person
{

    /**
     * Konstruktor  objek kelas Anggota.
     *
     * @param id           ID.
     * @param nama         Nama.
     * @param ktp          KTP.
     * @param alamat       Alamat.
     * @param jenisKelamin Jenis kelamin.
     */
    public Anggota(int id, String nama, String ktp, String alamat, String jenisKelamin)
    {
        super(id, nama, ktp, alamat, jenisKelamin);
    }
}
