/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class Bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int a;
        int b;

        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan nilai a: ");
        a = keyboard.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = keyboard.nextInt();

        // Operator AND
        int andResult = a & b;
        System.out.println("Operator AND");
        System.out.println("a & b = " + andResult + " (desimal) \n["  + toBinary(andResult) + "] [biner]");

        // Operator OR
        int orResult = a | b;
        System.out.println("Operator OR");
        System.out.println("a | b = " + orResult + " (desimal) \n[" + toBinary(orResult) + "] [biner] ");

        // Operator XOR
        int xorResult = a ^ b;
        System.out.println("Operator XOR");
        System.out.println("a ^ b = " + xorResult + " (desimal) \n[" + toBinary(xorResult) + "][biner]");

        // Operator NOT
        int notResult = ~a;
        System.out.println("Operator NOT");
        System.out.println("~a = " + notResult + " (desimal) \n[" + toBinary(notResult) + "][biner]");

        // Operator Shift Left
        int shiftLeftResult = a << 2;
        System.out.println("Operator Shift Left");
        System.out.println("a << 2 = " + shiftLeftResult + " (desimal) \n[" + toBinary(shiftLeftResult) + "][biner]");

        // Operator Shift Right
        int shiftRightResult = a >> 2;
        System.out.println("Operator Shift Right");
        System.out.println("a >> 2 = " + shiftRightResult + " (desimal) \n[" + toBinary(shiftRightResult) + "][biner]");
    }

    public static String toBinary(int x) {
        return String.format("%10s", Integer.toBinaryString(x)).replace(' ', '0'); // TODO code application logic here
    }
    
}
