package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetelek {

    static Scanner sc = new Scanner(System.in); // scannert statikusan kell használni
    
    public static void main(String[] args) {
        // összegzés tétele
        int n = -1;
        while (n < 0){
            System.out.print("Be: ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i < n+1; i++){
            ossz += i;
        }
        System.out.printf("Első %d szám összege: %d\n", n, ossz);
        
        // megszámlálás tétele -> i < 100 ugyanaz, mint i <= 99
        int db = 0;
        for (int i = 10; i < 100; i++){
            if (i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű párosok száma: %d\n", db);
        
        // minimum
        int VEGE = 0;
        db = 0; // nem definiálom újra, csak lenullázom
        int min = Integer.MAX_VALUE;
        int szam;
        System.out.print("Nullára kilép: ");
        while((szam = sc.nextInt())!= VEGE){
            if(szam < min){
               min = szam;
            }
            db++;
        }
        System.out.printf("%d számból a legkisebb: %d", db, min);
        
        // eldötés tétele
        System.out.print("\nszám: ");
        n = sc.nextInt();
        boolean prim;
        if (n < 2){
            prim = false;
        }
        else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i != 0){
                i++;
            }
            prim = i > Math.sqrt(n);
        }
        if(prim){
            System.out.println("Prim");
        }
        else{
            System.out.println("Nme prim");
        }
        
        
    }//main
    
}//class vége
