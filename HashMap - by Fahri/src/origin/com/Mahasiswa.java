package origin.com;

import java.util.*;

public class Mahasiswa {
 public static void main(String[] args) {
  Map<String, Integer> nilaiMahasiswa = new HashMap<>();
  Scanner sc = new Scanner(System.in);

  while (true) {
   System.out.println("Pilih Menu: ");
   System.out.println("1. Tambah data mahasiswa");
   System.out.println("2. Hapus data mahasiswa");
   System.out.println("3. Tampilkan nilai mahasiswa");
   System.out.println("4. keluar");

   int pilihan = sc.nextInt();

   switch (pilihan) {

    case 1:
     System.out.print("Masukkan NIM: ");
     String nim = sc.next();

     System.out.print("Masukkan kelas: ");
     String kelas = sc.next();

     System.out.print("Masukkan nama: ");
     String nama = sc.next();

     System.out.print("Masukkan nilai: ");
     while (!sc.hasNextInt()) { // validasi apakah input bilangan bulat
      System.out.println("Input salah, silakan masukkan nilai dengan tipe data bilangan bulat!");
      System.out.print("Masukkan nilai: ");
      sc.next(); // membaca input yang tidak valid
     }
     int nilai = sc.nextInt();

     String key = nim + "-" + kelas + "-" + nama;
     nilaiMahasiswa.put(key, nilai);
     System.out.println("Data mahasiswa berhasil ditambahkan!");
     break;

    case 2:
     System.out.print("Masukkan NIM: ");
     nim = sc.next();

     System.out.print("Masukkan kelas: ");
     kelas = sc.next();

     System.out.print("Masukkan nama: ");
     nama = sc.next();
     sc.close();

     key = nim + "-" + kelas + "-" + nama;

     if (nilaiMahasiswa.containsKey(key)) {
      nilaiMahasiswa.remove(key);
      System.out.println("Data mahasiswa berhasil dihapus!");
     } else {
      System.out.println("Data mahasiswa tidak ditemukan!");
     }
     break;

    case 3:
     double totalNilai = 0;
     int jumlahMahasiswa = 0;
     System.out.println("Data nilai mahasiswa!");

     for (Map.Entry<String, Integer> entry : nilaiMahasiswa.entrySet()) {
      String[] keySplit = entry.getKey().split("-");
      nim = keySplit[0];
      kelas = keySplit[1];
      nama = keySplit[2];
      nilai = entry.getValue();
      System.out.println(nim + " " + kelas + " " + nama + " " + nilai);
      totalNilai += nilai;
      jumlahMahasiswa++;
     }

     if (jumlahMahasiswa > 0) {
      double rataRata = totalNilai / jumlahMahasiswa;
      System.out.println("Rata-rata nilai: " + rataRata);
     } else {
      System.out.println("Belum ada data nilai mahasiswa");
     }
     break;

    case 4:
     System.exit(0);
    default:
     System.out.println("Pilihan tidak tersedia");
     break;
   }

  }
 }
}