# Jawaban Pertanyaan Praktikum: Fungsi Rekursif

**Mata Kuliah:** Dasar Pemrograman
**JobSheet:** 14

---

## 1. Percobaan 1: Faktorial

**1. Apa yang dimaksud dengan fungsi rekursif?**
Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri di dalam blok kodenya. Fungsi ini menyelesaikan masalah dengan cara memecah masalah tersebut menjadi sub-masalah yang lebih kecil hingga mencapai kondisi berhenti yang disebut *base case*.

**2. Pada Percobaan1, apakah hasil yang diberikan fungsi `faktorialRekursif()` dan fungsi `faktorialIteratif()` sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!**
* **Hasil:** Ya, kedua fungsi menghasilkan nilai output yang sama persis.
* **Perbedaan Alur:**
    * **Fungsi Iteratif:** Menggunakan struktur perulangan (seperti `for` loop). Program melakukan perhitungan secara langsung dalam satu urutan eksekusi (misalnya mengalikan 5x4x3x2x1) tanpa membuat tumpukan pemanggilan fungsi baru.
    * **Fungsi Rekursif:** Menggunakan pemanggilan fungsi. Program akan memanggil dirinya sendiri secara berulang-ulang hingga mencapai *base case* (saat n=0). Setelah mencapai dasar, program melakukan fase substitusi (perhitungan balik dari bawah ke atas) untuk mendapatkan hasil akhir.

---

## 2. Percobaan 2: Pangkat

**1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif `hitungPangkat(bilangan, pangkat)`. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!**
Proses pemanggilan fungsi rekursif akan terus berjalan selama nilai parameter `pangkat` (variabel `y`) belum bernilai 0. Ketika nilai pangkat sudah mencapai 0, program akan masuk ke kondisi *base case* (`if y==0`) yang mengembalikan nilai 1 dan menghentikan proses pemanggilan fungsi tersebut.

**2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya.**
Untuk menampilkan deret perkalian (seperti `2x2x2x1 = 8`), modifikasi yang dilakukan pada fungsi adalah menambahkan perintah cetak (`System.out.print`) sebelum melakukan rekursi:
* Saat *base case* (y=0), program diperintahkan mencetak "1 = ".
* Saat *recursion call* (y>0), program diperintahkan mencetak angka bilangan diikuti tanda "x" (misalnya "2x") sebelum memanggil fungsi berikutnya.

---

## 3. Percobaan 3: Laba Investasi

**1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan "base case" dan "recursion call"!**
* **Base Case:** Adalah blok kode `if (tahun == 0)`. Pada kondisi ini, fungsi akan berhenti memanggil dirinya sendiri dan mengembalikan nilai saldo saat itu.
* **Recursion Call:** Adalah blok kode `else`, di mana terdapat baris `return (1.11 * hitungLaba(saldo, tahun - 1));`. Ini adalah bagian di mana fungsi memanggil dirinya sendiri kembali dengan nilai tahun yang dikurangi satu.

**2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai `hitungLaba(100000, 3)`!**

* **Fase Ekspansi (Penelusuran Turun):**
    1.  `hitungLaba(100000, 3)` memanggil fungsi untuk tahun ke-2.
    2.  `hitungLaba(100000, 2)` memanggil fungsi untuk tahun ke-1.
    3.  `hitungLaba(100000, 1)` memanggil fungsi untuk tahun ke-0.
    4.  `hitungLaba(100000, 0)` mencapai *Base Case* dan mengembalikan nilai 100.000.

* **Fase Substitusi (Perhitungan Naik):**
    1.  Hasil tahun ke-0 (100.000) dikembalikan ke atas.
    2.  Perhitungan tahun ke-1: 1.11 x 100.000 = **111.000**.
    3.  Perhitungan tahun ke-2: 1.11 x 111.000 = **123.210**.
    4.  Perhitungan tahun ke-3: 1.11 x 123.210 = **136.763,1**.

---

## 4. Tugas

**Penjelasan Logika Penyelesaian:**

Untuk menghitung total penjumlahan dari $N$ angka yang diinputkan ($1+2+3+...+N$), logika yang digunakan adalah:

1.  **Metode Rekursif:**
    Program dibuat dengan fungsi yang menerima parameter jumlah angka ($n$). Jika $n$ belum habis (belum 0), fungsi akan meminta user menginputkan angka, lalu angka tersebut ditambahkan dengan hasil pemanggilan fungsi itu sendiri untuk $n-1$. Proses ini berulang hingga $n$ habis, lalu total penjumlahan dikembalikan ke program utama.

2.  **Metode Iteratif:**
    Program menggunakan perulangan biasa (`for` loop) yang berjalan sebanyak $n$ kali. Di setiap perulangan, program meminta input angka dari user dan langsung menambahkannya ke dalam variabel penampung total (`total += angka`). Setelah perulangan selesai, total akhir ditampilkan.