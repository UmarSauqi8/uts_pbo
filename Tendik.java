public class Tendik extends Karyawan {
        protected int jmLembur;

        public Tendik(int nip, String nama, String alamat, int tgl, int bln, int th, String gender, int thmasuk, int jmLembur) {
            super(nip, nama, alamat, tgl, bln, th, gender, thmasuk);
            this.jmLembur = jmLembur;
        }
        public int getjmLembur() {
            return jmLembur;
        }
        public int hitungBonus(int jamLembur) {
            int bonus = 0;

            for (int a = 0; a < jamLembur; a++) {
                bonus += 50000;
            }
            return bonus;
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

        public void hitungGaji(int jamLembur) {
            super.hitungGaji();
            System.out.println("Bonus Lembur  : " + hitungBonus(jamLembur));
            System.out.println("Total         : " + (getGaji() + hitungBonus(jamLembur)) + "\n");
        }

        public void cetak() {
            super.cetak();
            System.out.println("Jam Lembur    : " + getjmLembur());
            hitungGaji(getjmLembur());
        }
    }
