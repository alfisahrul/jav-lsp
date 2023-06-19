
import java.util.*;

/**
 *  Class person entitas objek untuk setiap orang yang menggunakan perpustakaan
 *  Masing-masing dari orang memiliki attribut yang sama
 */
public class Person {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String ktp;

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    private String alamat;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    private String jenisKelamin;

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Person(int id, String nama, String ktp, String alamat, String jenisKelamin) {
        this.id= id;
        this.nama = nama;
        this.ktp = ktp;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

}