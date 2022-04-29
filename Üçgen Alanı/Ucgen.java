import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ucgenin kenar uzunluklarını giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Ucgenin alani: " + alan);
    }
}
