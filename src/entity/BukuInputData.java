package entity;

public class BukuInputData {
    private int id;
    private String penulis;
    private String judul;
    private int stok;
    private int dipinjam;

    public BukuInputData(int id, String penulis, String judul, int stok, int dipinjam) {
        this.id = id;
        this.penulis = penulis;
        this.judul = judul;
        this.stok = stok;
        this.dipinjam = dipinjam;
    }

    // Getters and setters (if needed) for each property
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(int dipinjam) {
        this.dipinjam = dipinjam;
    }
}
