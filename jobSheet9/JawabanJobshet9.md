# 📝 Catatan Jobsheet 9: Array 1 (Versi Santai)

Ini rangkuman buat semua pertanyaan + tugas di Jobsheet 9. Biar gampang ingetnya!

---

## 🔬 Percobaan 1: Ngisi Array

Ini materi paling dasar, pokoknya soal bikin array sama ngakses isinya.

### Pertanyaan 1 (Error Tipe Data ❌)

* **Apa yang terjadi:** Programnya bakal **ERROR** pas di-*compile*. Gak bisa jalan.
* **Kenapa?** Gini, kita kan bikin array-nya `int[] bil`, itu artinya array-nya cuma mau nerima **bilangan bulat** (integer). Nah, angka `5.0` sama `7.5` itu bilangan desimal (ada koma-nya, tipenya `double`). Java gak suka kalo kita maksa masukin `double` ke `int`, soalnya bakal ada data yang ilang (angka di belakang koma).

### Pertanyaan 2 (Inisialisasi Langsung)

* **Modifikasi:** Kita bisa gabungin langkah deklarasi dan pengisian elemen jadi sebaris aja:
    ```java
    int[] bil = {5, 13, -7, 17};
    ```
* **Maksudnya:** Ini cara cepet kalo kita UDAH TAU semua isinya pas nulis kodenya.

### Pertanyaan 3 (Pake `for`)

* **Keluaran:** Hasilnya **SAMA PERSIS** kayak kode aslinya (nge-print 5, 13, -7, 17).
* **Maksudnya:** Ini namanya perulangan `for`. Daripada ngetik `System.out.println` 4 kali, mending pake loop.
    * `int i = 0;`: Bikin variabel `i` buat ngitung, mulai dari 0 (indeks pertama).
    * `i < 4;`: Loopnya bakal jalan terus selama `i` kurang dari 4 (jadi `i` nya 0, 1, 2, 3).
    * `i++`: Setiap selesai satu putaran, `i` nya nambah 1.
    * `System.out.println(bil[i]);`: Nge-print isi array `bil` di indeks ke-`i`.

### Pertanyaan 4 (Error `ArrayIndexOutOfBoundsException` 🤯)

* **Keluaran:** Programnya bakal **CRASH** pas dijalanin. Nanti muncul error serem namanya **`ArrayIndexOutOfBoundsException`**.
* **Kenapa?** Array `bil` kan isinya 4, berarti indeksnya cuma ada **0, 1, 2, sama 3**. Kalo kita ganti jadi `i <= 4`, loopnya bakal maksa jalan sampe `i = 4`. Pas dia nyoba ngakses `bil[4]`, programnya bingung... "lho, indeks ke-4 gak ada!"... terus crash deh.

---

## 🎓 Percobaan 2: Studi Kasus Nilai (Pake Input)

Sekarang kita pake `Scanner` buat ngisi array-nya dari input user.

### Pertanyaan 1 (`.length`)

* **Berubah Gak?** Enggak. Hasilnya sama aja.
* **Kenapa?** `nilaiAkhir.length` itu properti bawaan array, isinya ya panjang array-nya (di sini 10). Jadi, nulis `i < 10` sama `i < nilaiAkhir.length` itu sama aja. Tapi, pake `.length` itu **lebih bagus (best practice)**. Kenapa? Kalo nanti kita ganti `new int[10]` jadi `new int[50]`, loop-nya otomatis ngikutin. Gak perlu ganti angka `10` nya manual.

### Pertanyaan 2 (Kondisi `i < nilaiAkhir.length`)

* **Maksudnya:** Ini tuh **syarat berhentinya** loop. Gampangnya, "eh loop, kamu jalan terus ya selama `i` (indeksnya) masih **kurang dari** total panjang array-nya". Ini penting biar kita gak kelewat batas kayak di Percobaan 1 tadi.

### Pertanyaan 3 (Pake `if` doang)

* **Alur Programnya:**
    1.  Programnya masuk ke loop `for`, `i` mulai dari 0.
    2.  Di dalem loop, dia ngecek: `if (nilaiAkhir[i] > 70)`.
    3.  **Kalo** nilainya emang lebih dari 70 (misal 75), dia bakal nge-print "Mahasiswa ke-`i` lulus!".
    4.  **Kalo** nilainya 70 atau kurang (misal 60), dia diem aja, gak nge-print apa-apa, langsung lanjut ke putaran loop berikutnya.

### Pertanyaan 4 (Pake `if-else`)

* **Modifikasi:** Biar bisa nampilin "lulus" dan "tidak lulus", kita tinggal tambahin `else` di kode nomor 3.
    ```java
    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + i + " lulus!");
        } else {
            // Nah, ini dieksekusi kalo nilainya GAK lebih dari 70
            System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
        }
    }
    ```

---

## 🧮 Percobaan 3: Ngitung-ngitung Isi Array

Di sini kita ngolah data di dalem array, contohnya nyari rata-rata.

### Pertanyaan 1 (Ngitung Jumlah Lulus)

* **Modifikasi:** Gampang, kita cuma perlu 1 variabel lagi buat *counter*.
    ```java
    // ... (setelah kode rata-rata) ...
    
    int jumlahLulus = 0; // 1. Bikin variabel counter, awalnya 0
    
    // 2. Loop lagi buat ngecek
    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i] > 70) { // 3. Kalo nilainya lulus
            jumlahLulus++; // 4. Counternya ditambah 1
        }
    }
    
    // 5. Tampilkan hasilnya
    System.out.println("Banyaknya mahasiswa yang lulus = " + jumlahLulus);
    ```

### Pertanyaan 2 (Rata-rata Lulus & Gak Lulus)

* **Logikanya:** Ini agak ribet, kita gabungin banyak hal.
    1.  **Input Dinamis:** Kita tanya dulu "Masukkan jumlah mahasiswa : ". Angkanya kita pake buat nentuin ukuran array-nya: `int[] nilaiMhs = new int[jumlahMhs];`.
    2.  **Bikin Variabel:** Kita perlu 4 variabel baru: `totalLulus`, `jumlahLulus`, `totalTdkLulus`, `jumlahTdkLulus`.
    3.  **Milah Data:** Pas kita ngisi nilai pake loop `for`, kita langsung pilah. Pake `if-else`.
        ```java
        // Di dalem loop for...
        nilaiMhs[i] = sc.nextInt();
        
        if (nilaiMhs[i] > 70) { // Asumsi lulus > 70
            totalLulus += nilaiMhs[i];
            jumlahLulus++;
        } else {
            totalTdkLulus += nilaiMhs[i];
            jumlahTdkLulus++;
        }
        ```
    4.  **Hitung Rata-rata:** Setelah loop-nya beres, baru kita hitung rata-rata masing-masing.
        `double rataLulus = totalLulus / jumlahLulus;`
        `double rataTdkLulus = totalTdkLulus / jumlahTdkLulus;`
    5.  **PENTING (Biar Gak Error):** Kalo ternyata GAK ADA yang lulus (`jumlahLulus = 0`), kode di atas bakal error (pembagian / 0). Jadi kode yang aman harusnya pake `if`:
        ```java
        double rataLulus = 0;
        if (jumlahLulus > 0) { // Cek dulu ada yg lulus gak
            rataLulus = totalLulus / jumlahLulus;
        }
        
        double rataTdkLulus = 0;
        if (jumlahTdkLulus > 0) { // Cek juga yg gak lulus
            rataTdkLulus = totalTdkLulus / jumlahTdkLulus;
        }
        
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
        ```

---

## 🔎 Percobaan 4: Searching

Di sini kita belajar nyari data (`searching`) di dalem array.

### Pertanyaan 1 (`break;`)

* **Maksudnya:** `break;` itu perintah buat **berhenti paksa** atau keluar dari blok perulangan (`for`) saat itu juga.
* **Tujuan:** Dalam kasus *searching*, ini dipake buat **efisiensi**. Begitu nilainya (`key`) ketemu, kita gak perlu buang waktu buat ngecek sisa elemen di array. Programnya langsung lompat keluar loop.

### Pertanyaan 2 (Input Dinamis)

* **Alur:** Ini gabungan Percobaan 2 dan 4.
    1.  Minta input "Masukkan banyaknya nilai: " (simpan di `jumlahNilai`).
    2.  Bikin array: `int[] arrNilai = new int[jumlahNilai];`.
    3.  Bikin loop `for` (dari 0 sampai `arrNilai.length`) buat ngisi array pake input user.
    4.  Minta input "Masukkan nilai yang ingin dicari: " (simpan di `key`).
    5.  Jalanin loop `for` pencarian kayak di kode asli.
    6.  Ubah output biar sesuai format: `System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));`. (Ditambah 1 karena indeks `hasil` mulai dari 0, sedangkan urutan mahasiswa mulai dari 1).

### Pertanyaan 3 ("Nilai tidak ditemukan" 🕵️)

* **Logika:** Kita gak bisa nentuin "gak ketemu" *di dalem* loop. Kita baru tau nilai itu gak ada **setelah** loop selesai nyari dan gak ketemu. Cara terbaik adalah pake "penanda" (flag).
    1.  Bikin variabel boolean sebelum loop: `boolean ditemukan = false;`.
    2.  Inisialisasi `hasil` ke nilai yang gak valid: `int indeksHasil = -1;`.
    3.  Di dalem loop pencarian, kalo nilai ketemu:
        ```java
        if (key == arrNilai[i]) {
            indeksHasil = i;
            ditemukan = true;
            break;
        }
        ```
    4.  **Setelah** loop selesai, periksa nilai *flag* tersebut:
        ```java
        if (ditemukan) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeksHasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        ```

---

## 📝 Penjelasan Tugas

Logika buat 3 soal tugasnya.

### Tugas 1: Statistik Nilai Mahasiswa

* **Tujuan:** Bikin program buat ngitung statistik (rata-rata, tertinggi, terendah).
* **Alur:**
    1.  Minta input jumlah nilai (N).
    2.  Bikin array `int[] nilai` berukuran N.
    3.  Siapin variabel: `double total = 0;`, `int nilaiTertinggi = Integer.MIN_VALUE;`, `int nilaiTerendah = Integer.MAX_VALUE;`.
        * **Tips:** `Integer.MIN_VALUE` itu nilai integer paling kecil se-Java. Ini trik biar nilai pertama yang diinput *pasti* bakal jadi `nilaiTertinggi` pas dibandingin pertama kali. Begitu juga sebaliknya buat `MAX_VALUE`.
    4.  Bikin satu loop `for` buat ngisi nilai. Di dalem loop ini, lakuin 3 hal:
        * Tambah nilai ke total: `total += nilai[i];` (buat rata-rata).
        * Cek nilai tertinggi: `if (nilai[i] > nilaiTertinggi) { nilaiTertinggi = nilai[i]; }`.
        * Cek nilai terendah: `if (nilai[i] < nilaiTerendah) { nilaiTerendah = nilai[i]; }`.
    5.  Setelah loop selesai, hitung rata-rata: `double rataRata = total / N;`.
    6.  Tampilkan semua hasil (rata-rata, tertinggi, terendah) dan tampilkan semua nilai.

### Tugas 2: Pemesanan Kafe (Total Biaya)

* **Tujuan:** Ngelola pesanan pake dua array terpisah (satu buat nama, satu buat harga) dan hitung total biayanya.
* **Alur:**
    1.  Minta input jumlah pesanan (N).
    2.  Bikin dua array: `String[] namaPesanan = new String[N];` dan `int[] hargaPesanan = new int[N];`.
    3.  Siapin `double totalBiaya = 0;`.
    4.  Bikin satu loop `for` (dari 0 sampai N).
    5.  Di dalem loop, minta input "Nama pesanan:" (simpan di `namaPesanan[i]`) dan "Harga:" (simpan di `hargaPesanan[i]`).
    6.  Langsung tambahin harga ke total: `totalBiaya += hargaPesanan[i];`.
    7.  Setelah loop, tampilkan `totalBiaya`.
    8.  Bikin loop `for` lagi buat nampilin daftar pesanan: `System.out.println(namaPesanan[i] + " - Rp " + hargaPesanan[i]);`.

### Tugas 3: Pencarian Menu Kafe (Linear Search) 🍔

* **Tujuan:** Implementasi *linear search* buat nyari string (nama makanan) di dalem array.
* **Alur:**
    1.  Bikin array `String[] menu` yang udah diisi (di-hardcode) nama menunya.
    2.  Minta input pengguna "Nama makanan yang ingin dicari:" (simpan di `makananCari`).
    3.  Pake logika "flag" yang sama persis kayak **Percobaan 4, Pertanyaan 3**:
        * Bikin `boolean ditemukan = false;`.
        * Bikin loop `for` dari 0 sampai `menu.length`.
        * Di dalem loop, cek: `if (menu[i].equalsIgnoreCase(makananCari))`.
            * **Penting:** Pake `.equalsIgnoreCase()` biar pencariannya gak peduli huruf besar/kecil (misal "Nasi Goreng" bakal ketemu kalo ngetik "nasi goreng").
        * Kalo `true`, set `ditemukan = true;` dan panggil `break;`.
    4.  Setelah loop selesai, cek `if (ditemukan)` buat nge-print "makanan tersebut tersedia" atau "makanan yang dicari tidak ada di menu".