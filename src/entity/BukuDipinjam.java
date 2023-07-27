package entity;

import java.util.ArrayList;

public class BukuDipinjam extends Buku {
    private ArrayList<Anggota> peminjam;
    private String dipinjam;

    public BukuDipinjam(int id, String penulis, String judul, int stok) {
        super(id, penulis, judul, stok);
        peminjam = new ArrayList<>();
        dipinjam = "Belum Dipinjam"; // Default value when a book is added
    }

    public ArrayList<Anggota> getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(ArrayList<Anggota> peminjam) {
        this.peminjam = peminjam;
    }

    public String getDipinjam() {
        return dipinjam;
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
