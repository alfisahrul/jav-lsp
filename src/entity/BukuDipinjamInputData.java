package entity;

public class BukuDipinjamInputData {
    private int id;
    private String penulis;
    private String judul;
    private int stok;
    // Add more fields if needed for input data

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
}
