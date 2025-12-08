# Penjelasan Jawaban Pertanyaan Jobsheet 12 (Fungsi 1)
**Nama:** Andrey Shevchenkho Eka Saputra  
**Kelas/Absen:** 03

---

## 2.1 Percobaan 1: Fungsi Tanpa Parameter

**1. [cite_start]Apakah fungsi tanpa parameter selalu harus bertipe void?** Jawabannya **tidak selalu** Fungsi tanpa parameter pun bisa punya tipe kembalian (seperti `int` atau `String`) asalkan dia me-`return` suatu nilai di dalamnya. Contohnya kalau kita bikin fungsi `ambilTahunSekarang()` yang langsung balikin angka 2025 tanpa butuh inputan apa-apa.

**2. [cite_start]Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()?** **Bisa banget** Caranya tinggal *copy-paste* semua kode `System.out.println` yang ada di dalam fungsi `Menu()` itu langsung ke dalam `public static void main`. Tapi, codingan di `main` bakal jadi panjang banget dan kalau mau nampilin menu berkali-kali jadi ribet (harus copas ulang).

**3. [cite_start]Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.** Keuntungannya biar **codingan lebih rapi dan modular**. 
* **Reusable:** Kalau kita butuh nampilin menu di baris lain, tinggal panggil `Menu();` aja, nggak perlu ngetik ulang.
* **Maintenance mudah:** Kalau mau ganti harga, cukup ganti di satu tempat (di fungsi itu aja), otomatis yang lain ikut berubah.

**4. [cite_start]Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main.** Alurnya begini:
1.  Program di-run, masuk ke `main`.
2.  Ketemu kode `Menu();`, program "loncat" masuk ke dalam fungsi `Menu`.
3.  Di situ dia jalanin semua perintah print baris per baris.
4.  Setelah selesai (kena tutup kurawal `}`), dia balik lagi ke `main` buat lanjutin baris kode di bawahnya pemanggilan tadi.

---

## 2.2 Percobaan 2: Fungsi Dengan Parameter

**1. [cite_start]Apakah kegunaan parameter di dalam fungsi?** Parameter itu kayak **inputan atau variabel titipan**. Gunanya biar fungsi kita jadi dinamis. Jadi satu fungsi yang sama bisa memproses data yang beda-beda tergantung apa yang kita "lempar" pas manggil fungsinya.

**2. [cite_start]Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?** Supaya programnya bisa **mengenali user**.
* `namaPelanggan`: Biar sapaannya personal ("Selamat datang, Andi!").
* `isMember`: Biar program bisa mikir (pakai if-else) buat nentuin si user ini dapet diskon atau enggak.

**3. Apakah parameter sama dengan variabel? [cite_start]Jelaskan.** Mirip tapi beda penempatan. 
* **Parameter:** Itu variabel yang dideklarasi di dalam kurung fungsi (header) buat nangkep nilai dari luar.
* **Variabel biasa:** Biasanya dideklarasi di dalam body fungsi buat pemrosesan lokal.
Intinya, parameter itu jembatan data dari luar ke dalam fungsi.

**4. [cite_start]Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu().** Cara kerjanya pakai logika percabangan (`if`). Pas fungsi dipanggil, kita kirim `true` atau `false`. Kalau `true`, blok kode diskon dijalankan (output diskon muncul). Kalau `false`, blok itu dilewati (output diskon gak muncul).

**5. [cite_start]Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter?** Bakal **Error (Compile Time Error)**. Java bakal protes karena jumlah argumen yang dikirim gak sesuai sama definisi fungsinya. Diminta 2 data (String sama boolean), tapi nggak dikasih apa-apa.

**8. [cite_start]Apakah penggunaan parameter namaPelanggan dan isMember membuat program lebih mudah dibaca?** **Iya**, karena di `main` kita jadi tahu konteksnya. Pas liat kode `Menu("Andi", true)`, kita langsung paham: "Oh, ini buat nampilin menu buat si Andi yang statusnya member". Lebih jelas daripada *hardcode* di dalam fungsi.

---

## 2.3 Percobaan 3: Fungsi dengan Nilai Kembalian

**1. [cite_start]Jelaskan kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan tidak.** * **Butuh return:** Kalau hasil proses fungsinya mau kita pakai lagi buat perhitungan lain (contoh: `hitungTotalHarga` hasilnya angka `total` yang bisa ditampilkan atau mungkin nanti ditambah pajak).
* **Tidak butuh (void):** Kalau fungsinya cuma buat aksi langsung, kayak nampilin teks ke layar doang (contoh: fungsi `Menu`).

**2. [cite_start]Sebutkan tipe data nilai kembalian dan parameter fungsi hitungTotalHarga.** * **Tipe return:** `int` (karena total harga bentuknya angka bulat).
* **Parameter:** Ada dua, yaitu `int pilihanMenu` (buat nentuin indeks array harga) dan `int banyakItem` (buat pengali jumlah pesanan).

---

## 2.4 Percobaan 4: Fungsi Varargs

**1. [cite_start]Jelaskan mengapa penulisan parameter ditulis dengan String... namaPengunjung!** Itu sintaks **Varargs (Variable Arguments)**. Maksudnya biar fungsi `daftarPengunjung` fleksibel, bisa nerima banyak input nama sekaligus (bisa 1 nama, 3 nama, dst) tanpa kita harus bikin array manual dulu pas manggil. Nanti di dalem fungsi, data itu otomatis dianggap array.

**3. [cite_start]Bisakah menggunakan dua tipe data varargs dalam satu fungsi?** **Enggak bisa**. Aturan Java bilang varargs cuma boleh satu per fungsi dan posisinya wajib paling belakang (parameter terakhir). Kalau ada dua, kompilernya bingung batas argumennya dimana.

**4. [cite_start]Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.** **Tetap jalan (tidak error)**. Parameter `namaPengunjung` bakal dianggap sebagai array kosong (length = 0). Jadi perulangan `for`-nya gak jalan, outputnya cuma nyetak judul "Daftar Nama Pengunjung:" terus selesai.

---

## 2.5 Percobaan 5: Fungsi vs Tanpa Fungsi

**1. [cite_start]Sebutkan tahapan eksekusi program pada Percobaan 5.** Urutannya:
1.  Input panjang (`p`), lebar (`l`), tinggi (`t`) di `main`.
2.  Panggil fungsi `hitungLuas(p, l)`. Fungsi hitung, terus balikin nilai luas ke variabel `L`.
3.  Tampilin `L`.
4.  Panggil fungsi `hitungVolume(t, p, l)`. Di dalem fungsi ini, dia manggil `hitungLuas` lagi, terus hasilnya dikali tinggi. Nilai balik ke variabel `vol`.
5.  Tampilin `vol`.

**5. Jelaskan kapan sebaiknya menggunakan parameter dan kapan tidak (mengacu pada Percobaan 5).** * **Pakai Parameter:** Kayak `hitungLuas(pjg, lb)`. Kita pakai parameter karena nilai panjang dan lebarnya dinamis (tergantung input user di `main`). [cite_start]Fungsi gak bisa ngehitung kalau gak dikasih tau angkanya berapa.
* **Tanpa Parameter:** Kalau nilai yang diproses selalu sama atau statis (misal fungsi buat nampilin header laporan yang teksnya itu-itu aja).

**6. Jelaskan kapan sebaiknya memiliki nilai kembalian (mengacu pada Percobaan 5).** Sebaiknya pakai **return value** kayak `hitungLuas` dan `hitungVolume` karena nilai hasil hitungannya (luas & volume) dibutuhkan oleh fungsi `main` buat ditampilkan ke user. [cite_start]Selain itu, nilai `hitungLuas` juga dibutuhkan (reusable) oleh fungsi `hitungVolume`.