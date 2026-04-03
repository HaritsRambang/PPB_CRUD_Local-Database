

## Tampilan Aplikasi
<img width="300" height="613" alt="image" src="https://github.com/user-attachments/assets/98429bbb-979a-472f-96d4-7d9a3edbf874" />



## Fitur Utama (CRUD)

Aplikasi ini memiliki 4 fungsi utama dalam pengelolaan basis data:

1. **Create:** Menambahkan catatan baru melalui *dialog box* dengan menekan tombol `+`.
2. **Read:** Mengambil dan menampilkan daftar catatan yang tersimpan di dalam *database* secara *real-time*.
3. **Update:** Mengedit isi teks catatan yang sudah ada dengan menekan ikon pensil (edit).
4. **Delete:** Menghapus catatan secara permanen dari *database* dengan menekan ikon tempat sampah (delete).

## Teknologi & Library yang Digunakan

Project ini dibangun dengan mengintegrasikan beberapa *library* penting:

* **[Isar Database](https://isar.dev/):** Digunakan sebagai basis data lokal (NoSQL) yang sangat cepat dan dioptimalkan khusus untuk Flutter.
* **Provider:** Digunakan sebagai *State Management* agar antarmuka (UI) dapat langsung diperbarui (*auto-refresh*) ketika ada perubahan data di *database*.
* **Path Provider:** Untuk menemukan lokasi direktori penyimpanan yang aman dan tepat di dalam sistem Android/iOS.

   ```bash
   flutter pub get
