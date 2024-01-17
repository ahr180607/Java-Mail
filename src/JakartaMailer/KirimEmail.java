package JakartaMailer;

/**
 * 
 * @author Ahmad Haikal Rizal
 */

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KirimEmail {
    private static final Logger LOGGER = Logger.getLogger(KirimEmail.class.getName());
    
    public static void main(String[] args) {
        // Informasi akun email pengirim
        String alamatPengirim = "ahr180607@gmail.com";
        String kataSandiPengirim = "krtrxvvvuszkkqyq";
        
        // Informasi penerima email
        String alamatPenerima = "ahr180607@gmail.com";
        
        // Properti Konfigurasi SMTP
        Properties properti = new Properties();
        properti.put("mail.smtp.host", "smtp.gmail.com");
        properti.put("mail.smtp.port", "587");
        properti.put("mail.smtp.auth", "true");
        properti.put("mail.smtp.starttls.enable", "true");
        
        // Membuat sesi
        Session sesi = Session.getInstance(properti, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(alamatPengirim, kataSandiPengirim);
            }
        });
        
        try {
            // Membuat objek pesan
            Message pesan = new MimeMessage(sesi);
            
            // Pengaturan alamat pengirim dan penerima
            pesan.setFrom(new InternetAddress(alamatPengirim));
            pesan.setRecipients(Message.RecipientType.TO, InternetAddress.parse(alamatPenerima));
            
            // Penganturan subjek dan isi pesan
            pesan.setSubject("Subjek Pesan Email");
            pesan.setText("Halo, ini tes pesan");
            
            // Mengirim pesan
            Transport.send(pesan);
            
            LOGGER.log(Level.INFO, "Email berhasil dikirim!");
            System.out.println("Email berhasil dikirim!");
        } catch (MessagingException e) {
            LOGGER.log(Level.SEVERE, "Terjadi kesalahan saat mengirim email", e);
            System.err.println("Gagal mengirim email. Lihat log untuk detail.");
        }
    }
}