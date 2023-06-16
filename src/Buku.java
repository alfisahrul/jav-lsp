public class Buku {

    public static void main(String[] args) {

    }
    public Buku() {
    }

    /**
     *
     */
    public int ID;

    /**
     *
     */
    public String Penulis;

    /**
     *
     */
    public String Judul;

    /**
     *
     */
    public int Stok;

    /**
     *
     */
    public int Dipinjam;

    /**
     *
     */


    /**
     * @param id
     * @param penulis
     * @param judul
     * @param stok
     * @param dipinjam
     */
    public void Buku(int id, String penulis, String judul, int stok, int dipinjam) {
        this.ID = id;
        this.Penulis = penulis;
        this.Judul = judul;
        this.Stok = stok;
        this.Dipinjam = dipinjam;

    }

    /**
     * @return
     */
    public void decreaseStok() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void increaseStok() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void decreaseDipinjam() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void increaseDipinjam() {
        // TODO implement here
        return;
    }

    /**
     *
     */
    public void printInfoBuku() {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getID() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id
     * @return
     */
    public void setID(int id) {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public String getPenulis() {
        // TODO implement here
        return "";
    }

    /**
     * @param penulis
     * @return
     */
    public void setPenulis(String penulis) {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public String getJudul() {
        // TODO implement here
        return "";
    }

    /**
     * @param judul
     * @return
     */
    public void setJudul(String judul) {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public int getStok() {
        // TODO implement here
        return 0;
    }

    /**
     * @param stok
     * @return
     */
    public void setStok(int stok) {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public int getDipinjam() {
        // TODO implement here
        return 0;
    }

    /**
     * @param dipinjam
     * @return
     */
    public void setDipinjam(int dipinjam) {
        // TODO implement here
        return ;
    }

}
