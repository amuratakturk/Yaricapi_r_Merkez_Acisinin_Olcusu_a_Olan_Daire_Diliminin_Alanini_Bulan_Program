import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int r;
        double a;
        double pi =3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz :");
        a = inp.nextDouble();

        double alan = (pi * (r*r) * a) / 360;
        System.out.println("Daire Diliminin Alanı :" + alan);
    }
}