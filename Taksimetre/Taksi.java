import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double km = scan.nextInt();
        double tutar = km * 2.2 + 10;
        double sonTutar = Math.max(tutar, 20);
        System.out.println("Taksimetre Tutari: " + sonTutar);
    }
}
