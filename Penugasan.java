
package operator;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class penugasan {

    public static void main(String[] args) {
          // Pengisian nilai dari input user
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan Input Nilai\n");
        System.out.print("Masukan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukan nilai b: ");
        int b = input.nextInt();

        System.out.print("Masukan nilai c: ");
        int c = input.nextInt();

        System.out.print("Masukan nilai d: ");
        int d = input.nextInt();

        System.out.print("Masukan nilai e: ");
        int e = input.nextInt();

        // Pengisian dan penambahan
        b += 10;

        // Pengisian dan perkalian
        c *= 2;

        // Pengisian dan pembagian
        d /= 2;

        // Pengisian dan sisa bagi
        e %= 2;

        // Output
        System.out.println("Pengisian Nilai a = " + a);
        System.out.println("Pengisian dan Penambahan Nilai b = " + b);
        System.out.println("Pengsian dan pengurangan Nilai c = " + c);
        System.out.println("Pengsian dan Perkalian Nilai d = " + d);
        System.out.println("Pengsian dan SIsa Bagi Nilai e = " + e);
    }
    
}
