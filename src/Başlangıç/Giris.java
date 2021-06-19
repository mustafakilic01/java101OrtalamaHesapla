package Başlangıç;
import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        // Değişkenleri oluştur.
        int mat, tarih, kimya,turce, fizik, muzik;

        //Scanner sınıfını tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerler:
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turce = inp.nextInt();

        //Değerler girildikten sonra hesaplamalar.
        int toplam = (mat + tarih + kimya + turce + fizik + muzik);
        double sonuc = (toplam / 6.0);

        //Ortalamasını hesaplatıyoruz.
        System.out.println("Derslerinizin ortalaması: " + sonuc);

        //Eğer ortalama 60 ve üzeri ise geçip kalacağını bildidiriyoruz.
        String durum = (sonuc >= 60)? "Geçti" : "Kaldı";
        System.out.println("Sınıfı geçme durumu : " + durum);

    }
}
