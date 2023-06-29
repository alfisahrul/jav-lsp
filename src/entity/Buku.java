package entity;

public class Buku {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String penulis;

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    private String judul;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    private int stok;

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    private int dipinjam;

    public int getDipinjam() {
        return this.dipinjam;
    }

    public void setDipinjam(int dipinjam) {
        this.dipinjam = dipinjam;
    }

    public Buku(int id, String penulis, String judul, int stok, int dipinjam)
    {
        this.id = id;
        this.penulis = penulis;
        this.judul = judul;
        this.stok = stok;
        this.dipinjam = dipinjam;
    }
}
