// Class turunan dari anggota
class Anggota extends Person {
    /**
     * Konstruktor  objek kelas Anggota.
     *
     * @param id           ID.
     * @param nama         Nama.
     * @param ktp          KTP.
     * @param alamat       Alamat.
     * @param jenisKelamin Jenis kelamin.
     */
    public Anggota(int id, String nama, String ktp, String alamat, String jenisKelamin) {
        super(id, nama, ktp, alamat, jenisKelamin);
    }

    /**
     * Menampilkan informasi tentang anggota
     */
    public void printInfoAnggota() {
        System.out.println("ID\t\t\t: " + this.getId());
        System.out.println("Nama\t\t\t: " + this.getNama());
        System.out.println("KTP\t\t\t: " + this.getKtp());
        System.out.println("Alamat\t\t\t: " + this.getAlamat());
        System.out.println("Jenis Kelamin\t\t: " + this.getJenisKelamin());
    }
}