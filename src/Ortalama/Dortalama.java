package Ortalama;
import java.util.Scanner;
public class Dortalama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mat, fzk, trc, kim, mzk,
            matO, fzkO, trcO, kimO, mzkO, ortalama;


        System.out.print("Matematik notunuzu giriniz : ");
        mat = sc.nextInt();

        if ( ( mat < 0 ) || ( mat > 100) ) {

            mat = 0;
            matO =0;
            System.out.println("Matematik notunuz geçersiz değer girildiği için ortalamaya dahil edilmemiştir");

        }else {

            matO = 1;

        }

        System.out.print("Fizik notunuzu giriniz : ");
        fzk = sc.nextInt();

        if ( ( fzk < 0 ) || ( fzk > 100) ){

            fzk = 0;
            fzkO = 0;
            System.out.println("Fizik notunuz geçersiz değer girildiği için ortalamaya dahil edilmemiştir");

        }else {

            fzkO = 1;

        }

        System.out.print("Türkçe notunuzu giriniz : ");
        trc = sc.nextInt();

        if ( ( trc < 0 ) || ( trc > 100) ){

            trc = 0;
            trcO = 0;
            System.out.println("Türkçe notunuz geçersiz değer girildiği için ortalamaya dahil edilmemiştir");

        }else {

            trcO = 1;

        }

        System.out.print("Kimya notunuzu giriniz : ");
        kim = sc.nextInt();

        if ( ( kim < 0 ) || ( kim > 100) ){

            kim = 0;
            kimO = 0;
            System.out.println("Kimya notunuz geçersiz değer girildiği için ortalamaya dahil edilmemiştir");

        }else {

            kimO = 1;

        }

        System.out.print("Müzik notunuzu giriniz : ");
        mzk = sc.nextInt();

        if ( ( mzk < 0 ) || ( mzk > 100) ){

            mzk = 0;
            mzkO = 0;
            System.out.println("Müzik notunuz geçersiz değer girildiği için ortalamaya dahil edilmemiştir");

        }else {

            mzkO = 1;

        }

        ortalama = (mat + fzk + trc + kim + mzk) / (matO + fzkO + trcO + kimO + mzkO);

        System.out.println("Ortalamanız : " + ortalama);
    }


}

