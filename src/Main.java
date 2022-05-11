import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double alan,cevre,dilimAlani;
        System.out.print("Hesaplanmasını istediğininz yarıçapı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        alan = Math.PI * radius * radius;
        cevre = 2 * Math.PI * radius;
        System.out.println("Daire alanı : " + alan+"\nDaire çevresi : " + cevre);
        System.out.println("Hesaplamak istediğiniz daire diliminin merkez açısını giriniz : ");
        double alfa = scanner.nextDouble();
        dilimAlani = alan * (alfa/360);
        System.out.println("Dilim alanı : " + dilimAlani);



    }
}
