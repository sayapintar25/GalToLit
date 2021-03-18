package PboGalToLit;
import java.util.Scanner;
public class PboGalToLit {

    static double liter, hasil;
    static byte galon;
    private static Scanner fila ;

    public static void main(String[] args) {
        liter = (double) 3.785;
        fila = new Scanner(System.in);
        System.out.println("input jumlah Galon air : ");
        galon = fila.nextByte();
        hasil = galon*liter;
        System.out.println("Hasil konversinya nya :"+hasil+"liter");
    }
}
