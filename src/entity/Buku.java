package entity;

public class Buku {
    private int id;
    private String penulis;
    private String judul;
    private int stok;

    private int dipinjam;

    public Buku(int id, String penulis, String judul, int stok) {
        this.id = id;
        this.penulis = penulis;
        this.judul = judul;
        this.stok = stok;
    }

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

    public void decreaseStok() {
        if (stok > 0) {
            stok--;
        }
    }

    public void increaseStok() {
        stok++;
    }

    // Methods to update the dipinjam status
    public void decreaseDipinjam() {
        dipinjam--;
    }

    public void increaseDipinjam() {
        dipinjam++;
    }



    public void printInfoBuku() {
        System.out.println("ID: " + id);
        System.out.println("Penulis: " + penulis);
        System.out.println("Judul: " + judul);
        System.out.println("Stok: " + stok);
    }
}
