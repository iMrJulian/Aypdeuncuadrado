/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aypdeuncuadrado;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Aypdeuncuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l,a,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el lado del cuadrado");
        l = sc.nextInt();
        a = l*l;
        p = l*4;
        System.out.println("El area del cuadrado es: "+a);
        System.out.println("El perimetro del cuadrado es: "+p);
        // TODO code application logic here
    }
    
}
