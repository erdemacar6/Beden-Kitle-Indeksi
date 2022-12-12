import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

/*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu giriniz: (Örnek:1,79)");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz:" + bki);

        //erdemacar6


















    }

}
