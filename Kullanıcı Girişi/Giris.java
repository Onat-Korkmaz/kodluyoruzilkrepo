import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username, password;

        System.out.print("Kullanici adi giriniz: ");
        username = scan.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        password = scan.nextLine();

        if(username.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz!!!");
        } else {
            System.out.println("Bilgileriniz yanlis. Sifrenizi sifirlamak ister misiniz? (Y/n) ");
            String c = scan.nextLine();
            if(c.equals("Y")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                String newPassword = scan.nextLine();
                if(!password.equals(newPassword)) {
                    System.out.println("Sifre olusturuldu.");
                } else {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz");
                }
            }
        }
    }
}
