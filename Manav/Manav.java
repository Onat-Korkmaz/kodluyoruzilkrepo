import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, tutar;
        System.out.print("Armut kac kilo? ");
        armut = scan.nextDouble();
        System.out.print("Elma kac kilo? ");
        elma = scan.nextDouble();
        System.out.print("Domates kac kilo? ");
        domates = scan.nextDouble();
        System.out.print("Muz kac kilo? ");
        muz = scan.nextDouble();
        System.out.print("Patlican kac kilo? ");
        patlican = scan.nextDouble();

        tutar = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5;
        System.out.println("Toplam tutar: " + tutar + " TL");
    }
}
