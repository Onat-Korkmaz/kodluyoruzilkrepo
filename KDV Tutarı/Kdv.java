import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat: ");
        double f1 = scan.nextInt();
        double f2 = (f1 < 1000) ? (f1*118/100) : (f1*108/100);
        System.out.print("KDV'li Fiyat: " + f2);
    }
}
