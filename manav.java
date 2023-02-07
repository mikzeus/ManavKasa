import java.util.Scanner;

public class manav {
    public static void main(String[] args) {

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates =1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen almak istediginiz ARMUT miktarini kg cinsinden giriniz: ");
        int A = scan.nextInt();
        System.out.println(A + "Kg ARMUT icin Odemeniz gereken toplam miktar = " + A*Armut);

        System.out.println("lutfen almak istediginiz ELMA miktarini kg cinsinden giriniz: ");
        int E = scan.nextInt();
        System.out.println(E + "Kg ELMA icin Odemeniz gereken toplam miktar = "+ E*Elma);

        System.out.println("lutfen almak istediginiz DOMATES miktarini kg cinsinden giriniz: ");
        int D = scan.nextInt();
        System.out.println(D + "Kg DOMATES icin Odemeniz gereken toplam miktar = " + D*Domates);

        System.out.println("lutfen almak istediginiz MUZ miktarini kg cinsinden giriniz: ");
        int M = scan.nextInt();
        System.out.println(M + "Kg icin Odemeniz gerekn toplam miktar = " + M*Muz);

        System.out.println("lutfen almak istediginiz PATLICAN miktarini kg cinsinden giriniz: ");
        int P = scan.nextInt();
        System.out.println(P + "Kg PATLICAN icin Odemeniz gerekn toplam miktar = " + P*Patlıcan);

        double toplam= E*Elma+A*Armut+D*Domates+M*Muz+P*Patlıcan;

        System.out.println("Toplam odemeniz gereken miktar = " + toplam);



    }
}
