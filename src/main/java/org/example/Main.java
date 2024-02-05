package org.example;

import java.util.Scanner;

// Klavyeden girilen kelimeyi belirtilen anahtarlara göre "Affine Şigfreleme (Affine Cipher)" algoritmasıyla şifreleyen program
// Her harf ( ax + b ) mod 26 fonksiyonuyla şifrelenir ; burada b, kaymanın büyüklüğüdür.
// Bu şifreleme yöntemindeki amaç geometride doğrunun denklemi olarak bilinen y=ax+b doğrusal fonksiyonunu şifreleme işleminde kullanmaktır.
// Orn. İngiliz Alfabesini(26 harf) Kullanarak "Bursa" ismini a=5 ve b=1 anahtarıyla şifrelenmesi
// Sonuc = Bursa --> (a) --> 5 (b) --> 1 Şifreli Kelime ---->>> GXINB
// Java -5-1-> UBCB
public class Main {
    public static void main(String[] args) {

        String m,sm = " ";
        int i,a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLütfen Kelimeyi Giriniz : ");
        m = scanner.nextLine().toUpperCase();
        System.out.print("Anahtar ( a ) : ");
        a = scanner.nextInt();
        System.out.print("Anahtar ( b ) : ");
        b = scanner.nextInt();

        for (i=0; i<m.length(); i++)
            sm += (char) ((a*(m.charAt(i)-65)+b)%26+65);
        System.out.printf("Şifreli Kelime %s",sm);
    }
}
