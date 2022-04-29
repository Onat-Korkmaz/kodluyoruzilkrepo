import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;
        System.out.print("Ilk sayiyi giriniz: ");
        a = scan.nextDouble();
        System.out.print("Ikinci sayiyi giriniz: ");
        b = scan.nextDouble();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSeciminizi Giriniz: ");
        int select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (a+b));
                break;

            case 2:
                System.out.println("Cikarma: " + (a-b));
                break;

            case 3:
                System.out.println("Carpma: " + (a*b));
                break;

            case 4:
                System.out.println("Bolme: " + (a/b));
                break;
        
            default:
                System.out.println("Yanlis secim yaptiniz.");
                break;
        }
    }
}
