# JakartaMailer - Kirim Email dengan JavaMail API

## Deskripsi
Aplikasi sederhana untuk mengirim email menggunakan JavaMail API dengan menggunakan protokol SMTP. Aplikasi ini ditulis dalam bahasa Java dan dapat digunakan sebagai dasar untuk mengintegrasikan pengiriman email dalam proyek Java.

## Penggunaan
1. Pastikan Anda memiliki JavaMail API dalam classpath proyek Anda. Anda dapat mengunduhnya dari [situs resmi JavaMail](https://javaee.github.io/javamail/).
2. Isi informasi akun email pengirim dan penerima pada bagian berikut:
   ```java
   // Informasi akun email pengirim
   String alamatPengirim = "ahr180607@gmail.com";
   String kataSandiPengirim = "krtrxvvvuszkkqyq";
   
   // Informasi penerima email
   String alamatPenerima = "ahr180607@gmail.com";
   ```
3. Sesuaikan properti konfigurasi SMTP sesuai dengan penyedia email yang digunakan:
   ```java
   // Properti Konfigurasi SMTP
   Properties properti = new Properties();
   properti.put("mail.smtp.host", "smtp.gmail.com");
   properti.put("mail.smtp.port", "587");
   properti.put("mail.smtp.auth", "true");
   properti.put("mail.smtp.starttls.enable", "true");
   ```
4. Jalankan aplikasi dengan menjalankan metode `main` pada kelas `KirimEmail`.

## Kontribusi
Anda dapat berkontribusi pada pengembangan proyek ini dengan mengirimkan *pull request*. Pastikan untuk menyertakan deskripsi yang jelas mengenai perubahan yang Anda usulkan.

## Catatan
- Pastikan untuk merahasiakan informasi akun email pengirim dan kata sandi Anda.
- Aplikasi ini menggunakan Gmail sebagai penyedia SMTP. Jika Anda menggunakan penyedia lain, sesuaikan properti konfigurasi SMTP.

## Lisensi
Proyek ini dilisensikan di bawah Lisensi MIT - lihat [LICENSE](LICENSE) untuk detailnya.

---

**Catatan**: Proyek ini adalah contoh sederhana. Gunakan dengan bijak dan sesuaikan dengan kebutuhan proyek Anda.
