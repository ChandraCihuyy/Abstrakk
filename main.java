/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakk;

/**
 *
 * @author SMK TELKOM 09
 */
public class main {
     public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new Triagle(4, 5);

        // membuat objek dari class Circle
        Shape lingkaran = new Cicrle(10);


        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
}
}
