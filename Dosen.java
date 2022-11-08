public class Dosen extends Karyawan {
    protected int nidn;
    protected String jurusan;
    protected int lebihSks;

//    public Dosen(int nidn, String jurusan){
//        this.nidn = nidn;
//        this.jurusan = jurusan;
//    }

    public Dosen(int nip, String nama, String alamat, int tgl, int bln, int th, String gender, int thmasuk, int nidn, String jurusan, int lebihSks) {
        super(nip, nama, alamat, tgl, bln, th, gender, thmasuk);
        this.nidn = nidn;
        this.jurusan = jurusan;
        this.lebihSks = lebihSks;
    }

    public int getNidn() {
        return nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getlebihSks() {
        return lebihSks;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public int getNip() {
        return super.getNip();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public int getTgl() {
        return super.getTgl();
    }

    @Override
    public int getBln() {
        return super.getBln();
    }

    @Override
    public int getTh() {
        return super.getTh();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public int getThMasuk() {
        return super.getThMasuk();
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }


    public int Bonus(int lebihSks) {
        int bonus = 0;

        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < lebihSks; a++) {
                bonus += 100000;
            }
        }
        return bonus;
    }

    public void hitungGaji(int sksLebih) {
        super.hitungGaji();
        System.out.println("Bonus SKS     : " + Bonus(sksLebih));
        System.out.println("Total         : " + (getGaji() + Bonus(sksLebih)) + "\n");
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jurusan       : " + getJurusan());
        System.out.println("NIDN          : " + getNidn());
        System.out.println("SKS Lebih     : " + getlebihSks());
        hitungGaji(getlebihSks());
    }
}