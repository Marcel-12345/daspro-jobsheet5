import java.util.Scanner;

public class PemilihanHariDenganIf05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number;
        String dayType;

        System.out.print("Input day number: ");
        number = sc.nextInt();

        switch (number){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        dayType = "weekday";
        break;
        case 6:
        case 7:
        dayType = "weekend";
        break;
        default:
        dayType = "invalid number";

        }
        
        System.out.print("day " + number + " is a " + dayType);

    }

}