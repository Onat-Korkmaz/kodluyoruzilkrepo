import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r,a;
        System.out.print("Dairenin yaricapini giriniz: ");
        r = scan.nextDouble();
        System.out.print("Daire diliminin acisini giriniz: ");
        a = scan.nextDouble();

        double alan = Math.PI * r * r * a / 360;
        System.out.println("Daire diliminin alani: " + alan);
    }
}
