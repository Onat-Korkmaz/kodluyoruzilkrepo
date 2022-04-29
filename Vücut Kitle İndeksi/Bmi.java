import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double boy, kilo, bmi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        bmi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}
