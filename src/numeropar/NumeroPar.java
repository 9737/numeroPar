/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar;
import java.util.Scanner;
/**
 *
 * @author daw
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner t = new Scanner(System.in);
        
        //int n=(int) (Math.random()*101+100);
        System.out.print("Introduce un número: ");
        int n = t.nextInt();
        System.out.println();
        System.out.print("Has introducido el número: "+n);
        if (n%2==0) {
                System.out.println(" y este número es par.");
        } else {
                System.out.println(" y este número es impar.");
        }
    }
}
