public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen(0137, "Umar", "Bengkulu, Bengkulu", 05,05,2003, "Laki-Laki", 2016, 2100018137, "Informatika",10 );
        System.out.println("Dosen");
        dosen1.cetak();

        Tendik tendik1 = new Tendik(0138,"sauqi", "Bumi ijo, Yogyakarta",01,01,2001,"Laki-Laki", 2020, 10);
        System.out.println("Tendik");
        tendik1.cetak();
    }
}
