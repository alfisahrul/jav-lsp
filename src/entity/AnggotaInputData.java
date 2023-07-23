package entity;

public class AnggotaInputData {
    private int id;
    private String nama;
    private String ktp;
    private String alamat;
    private String jenisKelamin;

    public AnggotaInputData(int id, String nama, String ktp, String alamat, String jenisKelamin) {
        this.id = id;
        this.nama = nama;
        this.ktp = ktp;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKtp() {
        return ktp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin()
    {
        return jenisKelamin;
    }
// Getters and setters (if needed) for each property
}
