package entity;

import java.util.ArrayList;

public class BukuDipinjam extends Buku {

    private ArrayList<Anggota> peminjam;
    private String dipinjam;

    private  Anggota peminjam;

    public BukuDipinjam(int id, String judul, String penulis, int stok, int dipinjam, Anggota peminjam) {
        super(id, judul, penulis, stok, dipinjam);
        this.peminjam = peminjam;
    }
    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public ArrayList<Anggota> getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(ArrayList<Anggota> peminjam) {
        this.peminjam = peminjam;
    }



    public void setDipinjam(String dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void addPeminjam(Anggota anggota) {
        peminjam.add(anggota);
    }

    public void removePeminjam(Anggota anggota) {
        peminjam.remove(anggota);
    }

    @Override
    public String toString() {
        return super.toString() + ", dipinjam=" + dipinjam;
    }
}
