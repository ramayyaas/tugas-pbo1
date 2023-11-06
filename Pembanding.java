/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembanding;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Pembanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int x;
        int y;

        // Membaca input dari user
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai x: ");
        x = input.nextInt();
        System.out.print("Masukan nilai y: ");
        y = input.nextInt();

        // Operator ==
        System.out.println("x == y = " + (x == y));

        // Operator !=
        System.out.println("x != y = " + (x != y));

        // Operator >
        System.out.println("x > y = " + (x > y));

        // Operator <
        System.out.println("x < y = " + (x < y));

        // Operator >=
        System.out.println("x >= y = " + (x >= y));

        // Operator <=
        System.out.println("x <= y = " + (x <= y));
    }
    
}
