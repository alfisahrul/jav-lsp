package entity;
import java.util.ArrayList;
public class BukuDipinjam extends Buku
{
    private ArrayList<Anggota> peminjam;
    public BukuDipinjam(int id, String penulis, String judul, int stok, int dipinjam)
    {
        super(id, penulis, judul, stok, dipinjam);
        peminjam = new ArrayList<>();
    }
    public ArrayList<Anggota> getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(ArrayList<Anggota> peminjam) {
        this.peminjam = peminjam;
    }

    public void addPeminjam(Anggota anggota) {
        peminjam.add(anggota);
    }

    public void removePeminjam(Anggota anggota) {
        peminjam.remove(anggota);
    }


}
