package id.ac.uniska.pbo2.p02;
/**
* Kontrak untuk semua koleksi yang dapat dipinjam.
* Interface hanya menyebutkan apa yang harus bisa dilakukan, bukan caranya.
*/
public interface BisaDipinjam {

    int batasHariPinjam();

    long hitungDenda(int hariTerlambat);
}
