/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg9;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1, num2, lcm;
        System.out.println("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scan.nextInt();
        if (num2 % 2 == 1) {
            int gcd = num1;
            int residuo = num2 % gcd;
            while (residuo != 0) {
                num1 = num2;
                num2 = gcd;
                gcd = residuo;
                residuo = num1 % gcd;
            }
            lcm = (num1 * num2) / gcd;
            System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + lcm);
        } else {
            System.out.println("El segundo número es par, no se puede calcular el mínimo común múltiplo.");
        }
    }
}
    