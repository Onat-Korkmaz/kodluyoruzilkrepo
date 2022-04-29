import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mat, fiz, kim, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = scan.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        double sonuc = (mat + fiz + kim + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamanız: " + sonuc);
        String str = (sonuc > 60) ? "Sinifi Gectiniz" : "Sinifta Kaldiniz";
        System.out.println(str);
    }
}