## Screenshot Output Program

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/fd2073fd-dad5-4063-9e97-bb0eaae1e744" />

## Jawaban Eksperimen Praktikum 6

1. **Membuat objek dari kelas Koleksi**
   Kompiler menghasilkan error karena Koleksi merupakan kelas abstract
   dan tidak dapat dibuat objeknya secara langsung.

2. **Mengubah hitungDenda menjadi hitungdenda**
   Dengan @Override, muncul error karena method tidak cocok dengan
   method yang harus diimplementasikan. Tanpa @Override, Buku tetap
   error karena belum mengimplementasikan hitungDenda(int).
   Java membedakan huruf besar dan kecil.

3. **Membuat Buku dengan judul kosong**
   Program melempar IllegalArgumentException dengan pesan
   "Judul tidak boleh kosong" karena validasi pada konstruktor Koleksi.

4. **Mengubah status menjadi public**
   Hal ini melanggar enkapsulasi. Koleksi yang masih dipinjam dapat
   diubah menjadi TERSEDIA secara langsung, sehingga bisa dipinjam
   lagi dan data peminjam menjadi tidak konsisten.
