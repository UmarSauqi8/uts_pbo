public class Karyawan {
        protected int nip;
        protected String nama;
        protected String alamat;
        protected int tgl;
        protected int bln;
        protected int th;
        protected String gender;
        protected int thmasuk;
        protected int gaji = 2000000;
        public int lembur;

        public Karyawan(int nip, String nama, String alamat, int tgl, int bln, int th, String gender, int thmasuk) {
            this.nip = nip;
            this.nama = nama;
            this.alamat = alamat;
            this.tgl = tgl;
            this.bln = bln;
            this.th = th;
            this.gender = gender;
            this.thmasuk = thmasuk;
        }

        public void hitungLembur(){
            this.lembur = 50000*24;
        }

        public String getNama() {
            return nama;
        }

        public int getNip() {
            return nip;
        }

        public String getAlamat() {
            return alamat;
        }

        public int getTgl() {
            return tgl;
        }
        public int getBln() {
            return bln;
        }

        public int getTh() {
            return th;
        }

        public String getGender() {
            return gender;
        }

        public int getThMasuk() {
            return thmasuk;
        }
        public void setGaji(int gaji) {
            this.gaji = gaji;
        }
        public int getGaji() {
            return gaji;
        }
        public void hitungGaji() {
            System.out.println("Gaji          : " + getGaji());
        }
        protected void cetak() {
            System.out.println("NIP           : " + getNip());
            System.out.println("Nama          : " + getNama());
            System.out.println("Alamat        : " + getAlamat());
            System.out.println("Tanggal Lahir : " + getTgl()+"-"+getBln()+"-"+getTh());
            System.out.println("Jenis Kelamin : " + getGender());
            System.out.println("Tahun masuk   : " + getThMasuk());
        }
    }
