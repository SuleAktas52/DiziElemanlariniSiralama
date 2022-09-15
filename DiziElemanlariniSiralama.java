import  java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariniSiralama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Dizi Kac Elemanli Olsun? : ");
        int boyut=input.nextInt();

        int[] dizi=new int[boyut];

        System.out.println("Dizinin Elemanlarini Giriniz");

        int counter=0;

        for (int i=0; i < dizi.length; i++){
            System.out.print(i +1 + ". Elemani: ");
            dizi[i]=input.nextInt();
            counter++;
        }
        System.out.println("Dizinin Boyutu: " + counter);
        Arrays.sort(dizi);
        System.out.println("Siralama: " + Arrays.toString(dizi));
    }
}

/*
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
 */