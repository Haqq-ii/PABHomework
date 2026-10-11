# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
Colour used: Color.LightGray  
Padding kept: 24.dp  
What changed / what stayed the same: Ketika padding diubah menjadi 8.dp, jarak antara tepi luar layar dengan teks atau gambar menjadi sangat sempit sehingga elemen terlihat mepet ke pinggir. Saat diubah menjadi 48.dp, area margin di sekitar konten menjadi sangat luas dan mendorong teks serta gambar lebih ke tengah. Hal yang tetap sama adalah urutan tata letak elemen di dalam Column (teks salam, teks ide aplikasi, dan gambar tetap tersusun dari atas ke bawah).

## Task 4: Build Error
First error message: `File-based resource names must contain only lowercase a-z, 0-9, or underscore`
Cause: Sesuai aturan penamaan resource pada Android, nama file gambar hanya boleh menggunakan huruf kecil (a-z), angka (0-9), dan garis bawah (_). Penggunaan huruf kapital ('M', 'P') dan tanda hubung/strip ('-') pada `My-Picture.png` menyebabkan sistem pembacaan resource gagal.
Why other errors appear: Error lanjutan seperti `Unresolved reference: my_picture` muncul karena proses kompilasi gagal membuat ID unik di kelas `R.drawable` untuk file yang namanya invalid tersebut, sehingga kode Kotlin tidak dapat menemukan referensi gambarnya.
Fix: Mengubah nama file gambar kembali menjadi huruf kecil dan menggunakan underscore, yaitu `my_picture.png`.

## Task 5: Explore the Project
(a) MainActivity: path `app/src/main/java/com/example/myfirstcomposeapp/MainActivity.kt` Merupakan komponen utama aplikasi (Activity) tempat fungsi-fungsi Composable dipanggil dan dirender ke layar pengguna.  
(b) Gradle file: path `app/build.gradle.kts` Berfungsi untuk mengonfigurasi pengaturan build modul aplikasi, menentukan dependensi library (seperti Jetpack Compose), serta versi SDK.  
(c) Launcher image line: `painter = painterResource(id = R.drawable.ic_launcher_foreground)` Berfungsi untuk mengambil dan menampilkan file gambar vektor ikon bawaan Android dari folder `res/drawable`.

## Task 6: Preview vs Run
Saat teks diubah dan Preview diperbarui, hanya pratinjau visual di Android Studio yang digambar ulang. Aplikasi di emulator belum berubah karena file APK yang terpasang di perangkat masih menggunakan hasil kompilasi kode yang lama. Langkah yang diperlukan agar perubahan muncul di perangkat adalah menekan tombol  untuk run ulang agar melakukan build ulang dan menginstal APK terbaru ke perangkat.

## Task 7: Views vs Compose
1. Pendekatan **Imperative Views** berfokus pada *bagaimana* UI diubah selangkah demi selangkah secara manual (misalnya mencari komponen dengan `findViewById` lalu memanggil `textView.setText(...)`). Sedangkan pendekatan **Declarative Compose** seperti pada `MyFirstScreen` berfokus pada mendeskripsikan *apa* bentuk UI yang ingin ditampilkan berdasarkan kondisi/data saat ini. Saat data berubah, Compose akan secara otomatis memperbarui atau menggambar ulang (recomposition) tampilan layar tanpa perlu instruksi manual.

2.
| Composable | Package | Library layer |
|---|---|---|
| Column | `androidx.compose.foundation.layout` | Foundation |
| Text | `androidx.compose.material3` | Material |
| Image | `androidx.compose.foundation` | Foundation |