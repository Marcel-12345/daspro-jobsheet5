import java.util.Scanner;

public class PemilihanBilanganModif05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String hasil;

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();


        hasil = (angka % 2 == 0) ? ("Angka " + angka + " termasuk bilangan genap") : ("Angka " + angka + " termasuk bilangan ganjil");
        
        System.out.print(hasil);

    }

}