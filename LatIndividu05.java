import java.util.Scanner;

public class LatIndividu05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int usia;
        String kategori;

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            kategori = "anak";
            } else if (usia >= 13 && usia <= 19) {
            kategori = "remaja";
            } else if (usia >= 20 && usia <= 64) {
            kategori = "dewasa";
            } else if (usia >= 65){
            kategori = "lansia";
            } else {
            kategori = "invalid number";
            }
                

        System.out.println("Usia " + usia + " termasuk kategori " + kategori);

    }
}